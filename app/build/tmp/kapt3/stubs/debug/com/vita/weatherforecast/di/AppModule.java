package com.vita.weatherforecast.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/vita/weatherforecast/di/AppModule;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "getClient", "Lokhttp3/OkHttpClient;", "provideMoshi", "provideWeatherApi", "Lcom/vita/weatherforecast/data/remote/WeatherApiService;", "provideWeatherDatabase", "Lcom/vita/weatherforecast/data/local/WeatherAppDatabase;", "app", "Landroid/app/Application;", "app_debug"})
@dagger.Module
public final class AppModule {
    private final com.squareup.moshi.Moshi moshi = null;
    
    public AppModule() {
        super();
    }
    
    private final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    private final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.vita.weatherforecast.data.remote.WeatherApiService provideWeatherApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.vita.weatherforecast.data.local.WeatherAppDatabase provideWeatherDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
}