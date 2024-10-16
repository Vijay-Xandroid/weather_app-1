package com.vita.weatherforecast.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Main")
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B_\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012Jz\u0010\'\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010(J\t\u0010)\u001a\u00020\bH\u00d6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\t\u00101\u001a\u00020\bH\u00d6\u0001J\t\u00102\u001a\u00020/H\u00d6\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012\u00a8\u00068"}, d2 = {"Lcom/vita/weatherforecast/data/local/entity/MainEntity;", "Landroid/os/Parcelable;", "main", "Lcom/vita/weatherforecast/data/remote/response/Main;", "(Lcom/vita/weatherforecast/data/remote/response/Main;)V", "feelsLike", "", "grndLevel", "", "humidity", "pressure", "seaLevel", "temp", "tempKf", "tempMax", "tempMin", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getFeelsLike", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGrndLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHumidity", "getPressure", "getSeaLevel", "getTemp", "getTempKf", "getTempMax", "getTempMin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/vita/weatherforecast/data/local/entity/MainEntity;", "describeContents", "equals", "", "other", "", "getHumidityString", "", "getTempString", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class MainEntity implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "feelsLike")
    private final java.lang.Double feelsLike = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "grndLevel")
    private final java.lang.Integer grndLevel = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "humidity")
    private final java.lang.Integer humidity = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "pressure")
    private final java.lang.Integer pressure = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "seaLevel")
    private final java.lang.Integer seaLevel = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "temp")
    private final java.lang.Double temp = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "tempKf")
    private final java.lang.Double tempKf = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "tempMax")
    private final java.lang.Double tempMax = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "tempMin")
    private final java.lang.Double tempMin = null;
    public static final android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.MainEntity> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.MainEntity copy(@org.jetbrains.annotations.Nullable
    java.lang.Double feelsLike, @org.jetbrains.annotations.Nullable
    java.lang.Integer grndLevel, @org.jetbrains.annotations.Nullable
    java.lang.Integer humidity, @org.jetbrains.annotations.Nullable
    java.lang.Integer pressure, @org.jetbrains.annotations.Nullable
    java.lang.Integer seaLevel, @org.jetbrains.annotations.Nullable
    java.lang.Double temp, @org.jetbrains.annotations.Nullable
    java.lang.Double tempKf, @org.jetbrains.annotations.Nullable
    java.lang.Double tempMax, @org.jetbrains.annotations.Nullable
    java.lang.Double tempMin) {
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
    
    public MainEntity(@org.jetbrains.annotations.Nullable
    java.lang.Double feelsLike, @org.jetbrains.annotations.Nullable
    java.lang.Integer grndLevel, @org.jetbrains.annotations.Nullable
    java.lang.Integer humidity, @org.jetbrains.annotations.Nullable
    java.lang.Integer pressure, @org.jetbrains.annotations.Nullable
    java.lang.Integer seaLevel, @org.jetbrains.annotations.Nullable
    java.lang.Double temp, @org.jetbrains.annotations.Nullable
    java.lang.Double tempKf, @org.jetbrains.annotations.Nullable
    java.lang.Double tempMax, @org.jetbrains.annotations.Nullable
    java.lang.Double tempMin) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getFeelsLike() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getGrndLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getHumidity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPressure() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSeaLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getTemp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getTempKf() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getTempMax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getTempMin() {
        return null;
    }
    
    @androidx.room.Ignore
    public MainEntity(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.remote.response.Main main) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTempString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHumidityString() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.MainEntity> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.MainEntity createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.MainEntity[] newArray(int size) {
            return null;
        }
    }
}