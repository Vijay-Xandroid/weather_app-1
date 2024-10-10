package com.vita.weatherforecast.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ5\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/vita/weatherforecast/domain/repository/WeatherForecastRepository;", "", "getWeatherByCity", "Lkotlinx/coroutines/flow/Flow;", "Lcom/vita/weatherforecast/utils/ApiResult;", "Lcom/vita/weatherforecast/domain/model/WeatherLocationResponseDomain;", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherForecast", "context", "Landroid/content/Context;", "latitude", "", "longitude", "(Landroid/content/Context;DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherForecastRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherForecast(@org.jetbrains.annotations.NotNull
    android.content.Context context, double latitude, double longitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.vita.weatherforecast.utils.ApiResult<com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherByCity(@org.jetbrains.annotations.NotNull
    java.lang.String cityName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.vita.weatherforecast.utils.ApiResult<com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain>>> continuation);
}