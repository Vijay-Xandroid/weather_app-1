package com.vita.weatherforecast.presentation.screens;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/vita/weatherforecast/presentation/screens/WeatherForecastDetails;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/vita/weatherforecast/databinding/FragmentWeatherDetailBinding;", "weatherForecastDetailsAdapter", "Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastDetailsAdapter;", "initView", "", "weatherDetails", "Lcom/vita/weatherforecast/domain/model/WeatherListDomain;", "city", "", "country", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class WeatherForecastDetails extends androidx.appcompat.app.AppCompatActivity {
    private com.vita.weatherforecast.databinding.FragmentWeatherDetailBinding binding;
    private com.vita.weatherforecast.presentation.adapter.WeatherForecastDetailsAdapter weatherForecastDetailsAdapter;
    
    public WeatherForecastDetails() {
        super();
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void initView(com.vita.weatherforecast.domain.model.WeatherListDomain weatherDetails, java.lang.String city, java.lang.String country) {
    }
}