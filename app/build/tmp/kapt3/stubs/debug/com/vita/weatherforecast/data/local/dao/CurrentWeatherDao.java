package com.vita.weatherforecast.data.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/vita/weatherforecast/data/local/dao/CurrentWeatherDao;", "", "deleteCurrentWeather", "", "getCount", "", "getCurrentWeather", "Landroidx/lifecycle/LiveData;", "Lcom/vita/weatherforecast/data/local/entity/WeatherListEntity;", "insertCurrentWeather", "weatherListEntity", "app_debug"})
public abstract interface CurrentWeatherDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM CurrentWeather")
    public abstract androidx.lifecycle.LiveData<com.vita.weatherforecast.data.local.entity.WeatherListEntity> getCurrentWeather();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertCurrentWeather(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.WeatherListEntity weatherListEntity);
    
    @androidx.room.Query(value = "DELETE FROM CurrentWeather")
    public abstract void deleteCurrentWeather();
    
    @androidx.room.Query(value = "Select count(*) from CurrentWeather")
    public abstract int getCount();
}