package com.vita.weatherforecast.di;

import com.vita.weatherforecast.data.remote.WeatherApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideWeatherApiFactory implements Factory<WeatherApiService> {
  private final AppModule module;

  public AppModule_ProvideWeatherApiFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public WeatherApiService get() {
    return provideWeatherApi(module);
  }

  public static AppModule_ProvideWeatherApiFactory create(AppModule module) {
    return new AppModule_ProvideWeatherApiFactory(module);
  }

  public static WeatherApiService provideWeatherApi(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideWeatherApi());
  }
}
