package com.vita.weatherforecast.data.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\'J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/vita/weatherforecast/data/local/dao/ForecastDao;", "", "deleteAll", "", "deleteForecast", "forecast", "Lcom/vita/weatherforecast/data/local/entity/WeatherLocationEntity;", "getCount", "", "getForecastByCoord", "Landroidx/lifecycle/LiveData;", "lat", "", "lon", "getWeatherForecast", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertWeatherForecast", "weatherLocationEntity", "(Lcom/vita/weatherforecast/data/local/entity/WeatherLocationEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ForecastDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Upsert
    public abstract java.lang.Object upsertWeatherForecast(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.WeatherLocationEntity weatherLocationEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM Forecast")
    public abstract java.lang.Object getWeatherForecast(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.vita.weatherforecast.data.local.entity.WeatherLocationEntity> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Forecast ORDER BY abs(:lat) AND abs(:lon) LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.vita.weatherforecast.data.local.entity.WeatherLocationEntity> getForecastByCoord(double lat, double lon);
    
    @androidx.room.Delete
    public abstract void deleteForecast(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.WeatherLocationEntity forecast);
    
    @androidx.room.Query(value = "DELETE FROM Forecast")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "Select count(*) from Forecast")
    public abstract int getCount();
}