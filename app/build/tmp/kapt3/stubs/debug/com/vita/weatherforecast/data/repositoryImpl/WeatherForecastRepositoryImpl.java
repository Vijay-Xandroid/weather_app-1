package com.vita.weatherforecast.data.repositoryImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J5\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/vita/weatherforecast/data/repositoryImpl/WeatherForecastRepositoryImpl;", "Lcom/vita/weatherforecast/domain/repository/WeatherForecastRepository;", "weatherApiService", "Lcom/vita/weatherforecast/data/remote/WeatherApiService;", "weatherAppDatabase", "Lcom/vita/weatherforecast/data/local/WeatherAppDatabase;", "(Lcom/vita/weatherforecast/data/remote/WeatherApiService;Lcom/vita/weatherforecast/data/local/WeatherAppDatabase;)V", "weatherForecastEntityMapper", "Lcom/vita/weatherforecast/data/mappers/WeatherForecastEntityMapper;", "weatherForecastMapperData", "Lcom/vita/weatherforecast/data/mappers/WeatherForecastMapperData;", "weatherForecastMapperDomain", "Lcom/vita/weatherforecast/data/mappers/WeatherForecastMapperDomain;", "getWeatherByCity", "Lkotlinx/coroutines/flow/Flow;", "Lcom/vita/weatherforecast/utils/ApiResult;", "Lcom/vita/weatherforecast/domain/model/WeatherLocationResponseDomain;", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherForecast", "context", "Landroid/content/Context;", "latitude", "", "longitude", "(Landroid/content/Context;DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherForecastRepositoryImpl implements com.vita.weatherforecast.domain.repository.WeatherForecastRepository {
    private final com.vita.weatherforecast.data.remote.WeatherApiService weatherApiService = null;
    private final com.vita.weatherforecast.data.local.WeatherAppDatabase weatherAppDatabase = null;
    private final com.vita.weatherforecast.data.mappers.WeatherForecastEntityMapper weatherForecastEntityMapper = null;
    private final com.vita.weatherforecast.data.mappers.WeatherForecastMapperDomain weatherForecastMapperDomain = null;
    private final com.vita.weatherforecast.data.mappers.WeatherForecastMapperData weatherForecastMapperData = null;
    
    @javax.inject.Inject
    public WeatherForecastRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.remote.WeatherApiService weatherApiService, @org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.WeatherAppDatabase weatherAppDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getWeatherForecast(@org.jetbrains.annotations.NotNull
    android.content.Context context, double latitude, double longitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.vita.weatherforecast.utils.ApiResult<com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getWeatherByCity(@org.jetbrains.annotations.NotNull
    java.lang.String cityName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.vita.weatherforecast.utils.ApiResult<com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain>>> continuation) {
        return null;
    }
}