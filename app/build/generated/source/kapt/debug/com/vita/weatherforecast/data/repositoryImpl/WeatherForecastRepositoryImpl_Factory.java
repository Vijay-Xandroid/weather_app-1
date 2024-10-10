package com.vita.weatherforecast.data.repositoryImpl;

import com.vita.weatherforecast.data.local.WeatherAppDatabase;
import com.vita.weatherforecast.data.remote.WeatherApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class WeatherForecastRepositoryImpl_Factory implements Factory<WeatherForecastRepositoryImpl> {
  private final Provider<WeatherApiService> weatherApiServiceProvider;

  private final Provider<WeatherAppDatabase> weatherAppDatabaseProvider;

  public WeatherForecastRepositoryImpl_Factory(
      Provider<WeatherApiService> weatherApiServiceProvider,
      Provider<WeatherAppDatabase> weatherAppDatabaseProvider) {
    this.weatherApiServiceProvider = weatherApiServiceProvider;
    this.weatherAppDatabaseProvider = weatherAppDatabaseProvider;
  }

  @Override
  public WeatherForecastRepositoryImpl get() {
    return newInstance(weatherApiServiceProvider.get(), weatherAppDatabaseProvider.get());
  }

  public static WeatherForecastRepositoryImpl_Factory create(
      Provider<WeatherApiService> weatherApiServiceProvider,
      Provider<WeatherAppDatabase> weatherAppDatabaseProvider) {
    return new WeatherForecastRepositoryImpl_Factory(weatherApiServiceProvider, weatherAppDatabaseProvider);
  }

  public static WeatherForecastRepositoryImpl newInstance(WeatherApiService weatherApiService,
      WeatherAppDatabase weatherAppDatabase) {
    return new WeatherForecastRepositoryImpl(weatherApiService, weatherAppDatabase);
  }
}
