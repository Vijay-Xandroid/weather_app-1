package com.vita.weatherforecast.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/vita/weatherforecast/presentation/viewmodel/WeatherForecastViewmodel;", "Landroidx/lifecycle/ViewModel;", "weatherForecastRepository", "Lcom/vita/weatherforecast/domain/repository/WeatherForecastRepository;", "(Lcom/vita/weatherforecast/domain/repository/WeatherForecastRepository;)V", "_isLoadingFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_weatherData", "Lcom/vita/weatherforecast/domain/model/WeatherLocationResponseDomain;", "isLoadingFlow", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "weatherData", "Lkotlinx/coroutines/flow/StateFlow;", "getWeatherData", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchWeather", "", "context", "Landroid/content/Context;", "latitude", "", "longtitude", "fetchWeatherByCity", "cityName", "", "app_debug"})
public final class WeatherForecastViewmodel extends androidx.lifecycle.ViewModel {
    private final com.vita.weatherforecast.domain.repository.WeatherForecastRepository weatherForecastRepository = null;
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoadingFlow;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isLoadingFlow = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain> _weatherData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain> weatherData = null;
    
    @javax.inject.Inject
    public WeatherForecastViewmodel(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.domain.repository.WeatherForecastRepository weatherForecastRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isLoadingFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain> getWeatherData() {
        return null;
    }
    
    public final void fetchWeather(@org.jetbrains.annotations.NotNull
    android.content.Context context, double latitude, double longtitude) {
    }
    
    public final void fetchWeatherByCity(@org.jetbrains.annotations.NotNull
    java.lang.String cityName) {
    }
}