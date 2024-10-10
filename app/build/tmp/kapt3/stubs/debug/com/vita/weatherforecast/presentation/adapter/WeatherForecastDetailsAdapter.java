package com.vita.weatherforecast.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0017J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastDetailsAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "weatherListData", "Lcom/vita/weatherforecast/domain/model/WeatherListDomain;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTransaction", "weatherListDomain", "ViewHolder", "app_debug"})
public final class WeatherForecastDetailsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vita.weatherforecast.presentation.adapter.WeatherForecastDetailsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private com.vita.weatherforecast.domain.model.WeatherListDomain weatherListData;
    
    public WeatherForecastDetailsAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.vita.weatherforecast.presentation.adapter.WeatherForecastDetailsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setTransaction(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.WeatherListDomain weatherListDomain) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.presentation.adapter.WeatherForecastDetailsAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastDetailsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastDetailsAdapter;Landroid/view/View;)V", "forecastIcon", "Landroid/widget/ImageView;", "getForecastIcon", "()Landroid/widget/ImageView;", "setForecastIcon", "(Landroid/widget/ImageView;)V", "hourOfDay", "Landroid/widget/TextView;", "getHourOfDay", "()Landroid/widget/TextView;", "temperature", "getTemperature", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView hourOfDay = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView temperature = null;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView forecastIcon;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getHourOfDay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTemperature() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getForecastIcon() {
            return null;
        }
        
        public final void setForecastIcon(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
    }
}