package com.vita.weatherforecast.data.remote.response;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u00102\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u00105\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u00c6\u0003J\u008c\u0001\u00109\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001\u00a2\u0006\u0002\u0010:J\t\u0010;\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u00d6\u0003J\b\u0010@\u001a\u00020\u0011H\u0007J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020\u0005H\u0003J\n\u0010D\u001a\u0004\u0018\u00010\u0007H\u0007J\u0006\u0010E\u001a\u00020\u0011J\u0006\u0010F\u001a\u00020\u0007J\b\u0010G\u001a\u0004\u0018\u00010\u0014J\t\u0010H\u001a\u00020\u0011H\u00d6\u0001J\t\u0010I\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0011H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u0006O"}, d2 = {"Lcom/vita/weatherforecast/data/remote/response/WeatherList;", "Landroid/os/Parcelable;", "clouds", "Lcom/vita/weatherforecast/data/remote/response/Clouds;", "dt", "", "dtTxt", "", "main", "Lcom/vita/weatherforecast/data/remote/response/Main;", "pop", "", "rain", "Lcom/vita/weatherforecast/data/remote/response/Rain;", "sys", "Lcom/vita/weatherforecast/data/remote/response/Sys;", "visibility", "", "weather", "", "Lcom/vita/weatherforecast/data/remote/response/Weather;", "wind", "Lcom/vita/weatherforecast/data/remote/response/Wind;", "(Lcom/vita/weatherforecast/data/remote/response/Clouds;Ljava/lang/Long;Ljava/lang/String;Lcom/vita/weatherforecast/data/remote/response/Main;Ljava/lang/Double;Lcom/vita/weatherforecast/data/remote/response/Rain;Lcom/vita/weatherforecast/data/remote/response/Sys;Ljava/lang/Integer;Ljava/util/List;Lcom/vita/weatherforecast/data/remote/response/Wind;)V", "getClouds", "()Lcom/vita/weatherforecast/data/remote/response/Clouds;", "getDt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDtTxt", "()Ljava/lang/String;", "getMain", "()Lcom/vita/weatherforecast/data/remote/response/Main;", "getPop", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRain", "()Lcom/vita/weatherforecast/data/remote/response/Rain;", "getSys", "()Lcom/vita/weatherforecast/data/remote/response/Sys;", "getVisibility", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/vita/weatherforecast/data/remote/response/Wind;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vita/weatherforecast/data/remote/response/Clouds;Ljava/lang/Long;Ljava/lang/String;Lcom/vita/weatherforecast/data/remote/response/Main;Ljava/lang/Double;Lcom/vita/weatherforecast/data/remote/response/Rain;Lcom/vita/weatherforecast/data/remote/response/Sys;Ljava/lang/Integer;Ljava/util/List;Lcom/vita/weatherforecast/data/remote/response/Wind;)Lcom/vita/weatherforecast/data/remote/response/WeatherList;", "describeContents", "equals", "", "other", "", "getColor", "getDateTime", "Ljava/time/DayOfWeek;", "s", "getDay", "getHourColor", "getHourOfDay", "getWeatherItem", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class WeatherList implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.data.remote.response.Clouds clouds = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long dt = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String dtTxt = null;
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.data.remote.response.Main main = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double pop = null;
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.data.remote.response.Rain rain = null;
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.data.remote.response.Sys sys = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.vita.weatherforecast.data.remote.response.Weather> weather = null;
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.data.remote.response.Wind wind = null;
    public static final android.os.Parcelable.Creator<com.vita.weatherforecast.data.remote.response.WeatherList> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.remote.response.WeatherList copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "clouds")
    com.vita.weatherforecast.data.remote.response.Clouds clouds, @org.jetbrains.annotations.Nullable
    java.lang.Long dt, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "main")
    com.vita.weatherforecast.data.remote.response.Main main, @org.jetbrains.annotations.Nullable
    java.lang.Double pop, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "rain")
    com.vita.weatherforecast.data.remote.response.Rain rain, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "sys")
    com.vita.weatherforecast.data.remote.response.Sys sys, @org.jetbrains.annotations.Nullable
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.vita.weatherforecast.data.remote.response.Weather> weather, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "wind")
    com.vita.weatherforecast.data.remote.response.Wind wind) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherList(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "clouds")
    com.vita.weatherforecast.data.remote.response.Clouds clouds, @org.jetbrains.annotations.Nullable
    java.lang.Long dt, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "main")
    com.vita.weatherforecast.data.remote.response.Main main, @org.jetbrains.annotations.Nullable
    java.lang.Double pop, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "rain")
    com.vita.weatherforecast.data.remote.response.Rain rain, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "sys")
    com.vita.weatherforecast.data.remote.response.Sys sys, @org.jetbrains.annotations.Nullable
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.vita.weatherforecast.data.remote.response.Weather> weather, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "wind")
    com.vita.weatherforecast.data.remote.response.Wind wind) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Clouds component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Main component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getPop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Rain component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Rain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Sys component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.data.remote.response.Weather> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.data.remote.response.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Wind component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Weather getWeatherItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final java.lang.String getDay() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.time.DayOfWeek getDateTime(long s) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final int getColor() {
        return 0;
    }
    
    public final int getHourColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHourOfDay() {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.vita.weatherforecast.data.remote.response.WeatherList> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.remote.response.WeatherList createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.remote.response.WeatherList[] newArray(int size) {
            return null;
        }
    }
}