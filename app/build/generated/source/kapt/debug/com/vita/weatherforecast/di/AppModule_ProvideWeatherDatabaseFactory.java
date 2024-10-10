package com.vita.weatherforecast.di;

import android.app.Application;
import com.vita.weatherforecast.data.local.WeatherAppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideWeatherDatabaseFactory implements Factory<WeatherAppDatabase> {
  private final AppModule module;

  private final Provider<Application> appProvider;

  public AppModule_ProvideWeatherDatabaseFactory(AppModule module,
      Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public WeatherAppDatabase get() {
    return provideWeatherDatabase(module, appProvider.get());
  }

  public static AppModule_ProvideWeatherDatabaseFactory create(AppModule module,
      Provider<Application> appProvider) {
    return new AppModule_ProvideWeatherDatabaseFactory(module, appProvider);
  }

  public static WeatherAppDatabase provideWeatherDatabase(AppModule instance, Application app) {
    return Preconditions.checkNotNullFromProvides(instance.provideWeatherDatabase(app));
  }
}
