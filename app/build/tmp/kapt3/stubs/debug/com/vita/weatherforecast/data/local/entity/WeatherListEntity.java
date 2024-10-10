package com.vita.weatherforecast.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "CurrentWeather")
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Bu\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\u0013\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010:\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010;\u001a\u00020\u000eH\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\t\u0010=\u001a\u00020\u0012H\u00c6\u0003J\t\u0010>\u001a\u00020\u0014H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0092\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\t\u0010B\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\b\u0010G\u001a\u00020\u0006H\u0007J\b\u0010H\u001a\u0004\u0018\u00010\u0018J\u0012\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020\nH\u0003J\t\u0010L\u001a\u00020\u0006H\u00d6\u0001J\t\u0010M\u001a\u00020\fH\u00d6\u0001J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b\'\u0010(R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R \u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104\u00a8\u0006S"}, d2 = {"Lcom/vita/weatherforecast/data/local/entity/WeatherListEntity;", "Landroid/os/Parcelable;", "weatherList", "Lcom/vita/weatherforecast/data/remote/response/WeatherList;", "(Lcom/vita/weatherforecast/data/remote/response/WeatherList;)V", "id", "", "clouds", "Lcom/vita/weatherforecast/data/local/entity/CloudsEntity;", "dt", "", "dtTxt", "", "main", "Lcom/vita/weatherforecast/data/local/entity/MainEntity;", "pop", "", "rain", "Lcom/vita/weatherforecast/data/local/entity/RainEntity;", "sys", "Lcom/vita/weatherforecast/data/local/entity/SysEntity;", "visibility", "weather", "", "Lcom/vita/weatherforecast/data/remote/response/Weather;", "wind", "Lcom/vita/weatherforecast/data/local/entity/WindEntity;", "(ILcom/vita/weatherforecast/data/local/entity/CloudsEntity;Ljava/lang/Long;Ljava/lang/String;Lcom/vita/weatherforecast/data/local/entity/MainEntity;Ljava/lang/Double;Lcom/vita/weatherforecast/data/local/entity/RainEntity;Lcom/vita/weatherforecast/data/local/entity/SysEntity;Ljava/lang/Integer;Ljava/util/List;Lcom/vita/weatherforecast/data/local/entity/WindEntity;)V", "getClouds", "()Lcom/vita/weatherforecast/data/local/entity/CloudsEntity;", "getDt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDtTxt", "()Ljava/lang/String;", "getId", "()I", "getMain", "()Lcom/vita/weatherforecast/data/local/entity/MainEntity;", "getPop", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRain", "()Lcom/vita/weatherforecast/data/local/entity/RainEntity;", "getSys", "()Lcom/vita/weatherforecast/data/local/entity/SysEntity;", "getVisibility", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/vita/weatherforecast/data/local/entity/WindEntity;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILcom/vita/weatherforecast/data/local/entity/CloudsEntity;Ljava/lang/Long;Ljava/lang/String;Lcom/vita/weatherforecast/data/local/entity/MainEntity;Ljava/lang/Double;Lcom/vita/weatherforecast/data/local/entity/RainEntity;Lcom/vita/weatherforecast/data/local/entity/SysEntity;Ljava/lang/Integer;Ljava/util/List;Lcom/vita/weatherforecast/data/local/entity/WindEntity;)Lcom/vita/weatherforecast/data/local/entity/WeatherListEntity;", "describeContents", "equals", "", "other", "", "getColor", "getCurrentWeather", "getDateTime", "Ljava/time/DayOfWeek;", "s", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class WeatherListEntity implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Embedded
    private final com.vita.weatherforecast.data.local.entity.CloudsEntity clouds = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "dt")
    private final java.lang.Long dt = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String dtTxt = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Embedded
    private final com.vita.weatherforecast.data.local.entity.MainEntity main = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double pop = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Embedded
    private final com.vita.weatherforecast.data.local.entity.RainEntity rain = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Embedded
    private final com.vita.weatherforecast.data.local.entity.SysEntity sys = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "visibility")
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "weather")
    private final java.util.List<com.vita.weatherforecast.data.remote.response.Weather> weather = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Embedded
    private final com.vita.weatherforecast.data.local.entity.WindEntity wind = null;
    public static final android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.WeatherListEntity> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.WeatherListEntity copy(int id, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.CloudsEntity clouds, @org.jetbrains.annotations.Nullable
    java.lang.Long dt, @org.jetbrains.annotations.Nullable
    java.lang.String dtTxt, @org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.MainEntity main, @org.jetbrains.annotations.Nullable
    java.lang.Double pop, @org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.RainEntity rain, @org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.SysEntity sys, @org.jetbrains.annotations.Nullable
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable
    java.util.List<com.vita.weatherforecast.data.remote.response.Weather> weather, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.WindEntity wind) {
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
    
    public WeatherListEntity(int id, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.CloudsEntity clouds, @org.jetbrains.annotations.Nullable
    java.lang.Long dt, @org.jetbrains.annotations.Nullable
    java.lang.String dtTxt, @org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.MainEntity main, @org.jetbrains.annotations.Nullable
    java.lang.Double pop, @org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.RainEntity rain, @org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.local.entity.SysEntity sys, @org.jetbrains.annotations.Nullable
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable
    java.util.List<com.vita.weatherforecast.data.remote.response.Weather> weather, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.WindEntity wind) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.local.entity.CloudsEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.local.entity.CloudsEntity getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.MainEntity component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.MainEntity getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getPop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.RainEntity component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.RainEntity getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.SysEntity component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.SysEntity getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.data.remote.response.Weather> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.data.remote.response.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.local.entity.WindEntity component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.local.entity.WindEntity getWind() {
        return null;
    }
    
    @androidx.room.Ignore
    public WeatherListEntity(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.remote.response.WeatherList weatherList) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.Weather getCurrentWeather() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final java.time.DayOfWeek getDateTime(long s) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final int getColor() {
        return 0;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.WeatherListEntity> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.WeatherListEntity createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.WeatherListEntity[] newArray(int size) {
            return null;
        }
    }
}