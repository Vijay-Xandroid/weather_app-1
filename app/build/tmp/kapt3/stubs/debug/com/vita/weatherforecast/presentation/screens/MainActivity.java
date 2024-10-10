package com.vita.weatherforecast.presentation.screens;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0003J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0015J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0006H\u0003J\u0012\u0010\'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)H\u0003J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/vita/weatherforecast/presentation/screens/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/vita/weatherforecast/databinding/ActivityMainBinding;", "city", "", "country", "gpsTracker", "Lcom/vita/weatherforecast/utils/extension/GpsTracker;", "latitude", "", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "longitude", "getLongitude", "setLongitude", "viewmodel", "Lcom/vita/weatherforecast/presentation/viewmodel/WeatherForecastViewmodel;", "getViewmodel", "()Lcom/vita/weatherforecast/presentation/viewmodel/WeatherForecastViewmodel;", "viewmodel$delegate", "Lkotlin/Lazy;", "weatherForecastAdapter", "Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastAdapter;", "getUserLocation", "", "initView", "launchWeatherDetailsScreen", "weatherListData", "Lcom/vita/weatherforecast/domain/model/WeatherListDomain;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "searchFilter", "cityName", "setCurrentWeather", "response", "Lcom/vita/weatherforecast/domain/model/WeatherLocationResponseDomain;", "showLoading", "isEnabled", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewmodel$delegate = null;
    private com.vita.weatherforecast.databinding.ActivityMainBinding binding;
    private com.vita.weatherforecast.presentation.adapter.WeatherForecastAdapter weatherForecastAdapter;
    private com.vita.weatherforecast.utils.extension.GpsTracker gpsTracker;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double latitude = 0.0;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double longitude = 0.0;
    private java.lang.String city = "";
    private java.lang.String country = "";
    
    public MainActivity() {
        super();
    }
    
    private final com.vita.weatherforecast.presentation.viewmodel.WeatherForecastViewmodel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getUserLocation() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void initView() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void searchFilter(java.lang.String cityName) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "UseCompatLoadingForDrawables"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void setCurrentWeather(com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain response) {
    }
    
    private final void launchWeatherDetailsScreen(com.vita.weatherforecast.domain.model.WeatherListDomain weatherListData) {
    }
    
    private final void showLoading(boolean isEnabled) {
    }
}