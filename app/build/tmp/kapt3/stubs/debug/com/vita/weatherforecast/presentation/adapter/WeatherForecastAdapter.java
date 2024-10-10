package com.vita.weatherforecast.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0017J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastAdapter$ViewHolder;", "context", "Landroid/content/Context;", "onWeatherListListener", "Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastAdapter$OnWeatherListListener;", "(Landroid/content/Context;Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastAdapter$OnWeatherListListener;)V", "getContext", "()Landroid/content/Context;", "weatherListData", "", "Lcom/vita/weatherforecast/domain/model/WeatherListDomain;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTransaction", "weatherListDomain", "OnWeatherListListener", "ViewHolder", "app_debug"})
public final class WeatherForecastAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vita.weatherforecast.presentation.adapter.WeatherForecastAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final com.vita.weatherforecast.presentation.adapter.WeatherForecastAdapter.OnWeatherListListener onWeatherListListener = null;
    private java.util.List<com.vita.weatherforecast.domain.model.WeatherListDomain> weatherListData;
    
    public WeatherForecastAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.presentation.adapter.WeatherForecastAdapter.OnWeatherListListener onWeatherListListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.vita.weatherforecast.presentation.adapter.WeatherForecastAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setTransaction(@org.jetbrains.annotations.Nullable
    java.util.List<com.vita.weatherforecast.domain.model.WeatherListDomain> weatherListDomain) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.presentation.adapter.WeatherForecastAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastAdapter$OnWeatherListListener;", "", "onWeatherListener", "", "weatherListData", "Lcom/vita/weatherforecast/domain/model/WeatherListDomain;", "app_debug"})
    public static abstract interface OnWeatherListListener {
        
        public abstract void onWeatherListener(@org.jetbrains.annotations.NotNull
        com.vita.weatherforecast.domain.model.WeatherListDomain weatherListData);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006!"}, d2 = {"Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lcom/vita/weatherforecast/presentation/adapter/WeatherForecastAdapter;Landroid/view/View;)V", "cardView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getCardView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setCardView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "dayOfWeek", "Landroid/widget/TextView;", "getDayOfWeek", "()Landroid/widget/TextView;", "maximumTemp", "getMaximumTemp", "minimumTemp", "getMinimumTemp", "temperature", "getTemperature", "timeOfDay", "getTimeOfDay", "weatherImage", "Landroid/widget/ImageView;", "getWeatherImage", "()Landroid/widget/ImageView;", "setWeatherImage", "(Landroid/widget/ImageView;)V", "onClick", "", "p0", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull
        private androidx.constraintlayout.widget.ConstraintLayout cardView;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView timeOfDay = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView dayOfWeek = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView temperature = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView minimumTemp = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView maximumTemp = null;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView weatherImage;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.constraintlayout.widget.ConstraintLayout getCardView() {
            return null;
        }
        
        public final void setCardView(@org.jetbrains.annotations.NotNull
        androidx.constraintlayout.widget.ConstraintLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTimeOfDay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDayOfWeek() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTemperature() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMinimumTemp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMaximumTemp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getWeatherImage() {
            return null;
        }
        
        public final void setWeatherImage(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.Nullable
        android.view.View p0) {
        }
    }
}