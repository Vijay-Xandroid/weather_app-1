package com.vita.weatherforecast.presentation.viewmodel;

import com.vita.weatherforecast.domain.repository.WeatherForecastRepository;
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
public final class WeatherForecastViewmodel_Factory implements Factory<WeatherForecastViewmodel> {
  private final Provider<WeatherForecastRepository> weatherForecastRepositoryProvider;

  public WeatherForecastViewmodel_Factory(
      Provider<WeatherForecastRepository> weatherForecastRepositoryProvider) {
    this.weatherForecastRepositoryProvider = weatherForecastRepositoryProvider;
  }

  @Override
  public WeatherForecastViewmodel get() {
    return newInstance(weatherForecastRepositoryProvider.get());
  }

  public static WeatherForecastViewmodel_Factory create(
      Provider<WeatherForecastRepository> weatherForecastRepositoryProvider) {
    return new WeatherForecastViewmodel_Factory(weatherForecastRepositoryProvider);
  }

  public static WeatherForecastViewmodel newInstance(
      WeatherForecastRepository weatherForecastRepository) {
    return new WeatherForecastViewmodel(weatherForecastRepository);
  }
}
