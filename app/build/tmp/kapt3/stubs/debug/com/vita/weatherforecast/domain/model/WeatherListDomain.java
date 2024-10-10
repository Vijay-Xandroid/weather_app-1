package com.vita.weatherforecast.domain.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u00102\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u00105\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u00c6\u0003J\u008c\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001\u00a2\u0006\u0002\u0010:J\t\u0010;\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u00d6\u0003J\t\u0010@\u001a\u00020\u0011H\u00d6\u0001J\t\u0010A\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0011H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u0006G"}, d2 = {"Lcom/vita/weatherforecast/domain/model/WeatherListDomain;", "Landroid/os/Parcelable;", "clouds", "Lcom/vita/weatherforecast/domain/model/CloudsDomain;", "dt", "", "dtTxt", "", "main", "Lcom/vita/weatherforecast/domain/model/MainDomain;", "pop", "", "rain", "Lcom/vita/weatherforecast/domain/model/RainDomain;", "sys", "Lcom/vita/weatherforecast/domain/model/SysDomain;", "visibility", "", "weather", "", "Lcom/vita/weatherforecast/domain/model/WeatherDomain;", "wind", "Lcom/vita/weatherforecast/domain/model/WindDomain;", "(Lcom/vita/weatherforecast/domain/model/CloudsDomain;Ljava/lang/Long;Ljava/lang/String;Lcom/vita/weatherforecast/domain/model/MainDomain;Ljava/lang/Double;Lcom/vita/weatherforecast/domain/model/RainDomain;Lcom/vita/weatherforecast/domain/model/SysDomain;Ljava/lang/Integer;Ljava/util/List;Lcom/vita/weatherforecast/domain/model/WindDomain;)V", "getClouds", "()Lcom/vita/weatherforecast/domain/model/CloudsDomain;", "getDt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDtTxt", "()Ljava/lang/String;", "getMain", "()Lcom/vita/weatherforecast/domain/model/MainDomain;", "getPop", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRain", "()Lcom/vita/weatherforecast/domain/model/RainDomain;", "getSys", "()Lcom/vita/weatherforecast/domain/model/SysDomain;", "getVisibility", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/vita/weatherforecast/domain/model/WindDomain;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vita/weatherforecast/domain/model/CloudsDomain;Ljava/lang/Long;Ljava/lang/String;Lcom/vita/weatherforecast/domain/model/MainDomain;Ljava/lang/Double;Lcom/vita/weatherforecast/domain/model/RainDomain;Lcom/vita/weatherforecast/domain/model/SysDomain;Ljava/lang/Integer;Ljava/util/List;Lcom/vita/weatherforecast/domain/model/WindDomain;)Lcom/vita/weatherforecast/domain/model/WeatherListDomain;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class WeatherListDomain implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.domain.model.CloudsDomain clouds = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long dt = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String dtTxt = null;
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.domain.model.MainDomain main = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double pop = null;
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.domain.model.RainDomain rain = null;
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.domain.model.SysDomain sys = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.vita.weatherforecast.domain.model.WeatherDomain> weather = null;
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.domain.model.WindDomain wind = null;
    public static final android.os.Parcelable.Creator<com.vita.weatherforecast.domain.model.WeatherListDomain> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.domain.model.WeatherListDomain copy(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.CloudsDomain clouds, @org.jetbrains.annotations.Nullable
    java.lang.Long dt, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.MainDomain main, @org.jetbrains.annotations.Nullable
    java.lang.Double pop, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.RainDomain rain, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.SysDomain sys, @org.jetbrains.annotations.Nullable
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable
    java.util.List<com.vita.weatherforecast.domain.model.WeatherDomain> weather, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.WindDomain wind) {
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
    
    public WeatherListDomain(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.CloudsDomain clouds, @org.jetbrains.annotations.Nullable
    java.lang.Long dt, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.MainDomain main, @org.jetbrains.annotations.Nullable
    java.lang.Double pop, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.RainDomain rain, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.SysDomain sys, @org.jetbrains.annotations.Nullable
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable
    java.util.List<com.vita.weatherforecast.domain.model.WeatherDomain> weather, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.domain.model.WindDomain wind) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.domain.model.CloudsDomain component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.domain.model.CloudsDomain getClouds() {
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
    public final com.vita.weatherforecast.domain.model.MainDomain component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.domain.model.MainDomain getMain() {
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
    public final com.vita.weatherforecast.domain.model.RainDomain component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.domain.model.RainDomain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.domain.model.SysDomain component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.domain.model.SysDomain getSys() {
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
    public final java.util.List<com.vita.weatherforecast.domain.model.WeatherDomain> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.domain.model.WeatherDomain> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.domain.model.WindDomain component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.domain.model.WindDomain getWind() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.vita.weatherforecast.domain.model.WeatherListDomain> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.domain.model.WeatherListDomain createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.domain.model.WeatherListDomain[] newArray(int size) {
            return null;
        }
    }
}