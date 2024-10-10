package com.vita.weatherforecast.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Forecast")
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004BG\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016JZ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010&J\t\u0010\'\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\u0006H\u00d6\u0001J\t\u0010-\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0006H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016\u00a8\u00063"}, d2 = {"Lcom/vita/weatherforecast/data/local/entity/WeatherLocationEntity;", "Landroid/os/Parcelable;", "weatherLocationResponse", "Lcom/vita/weatherforecast/data/remote/response/WeatherLocationResponse;", "(Lcom/vita/weatherforecast/data/remote/response/WeatherLocationResponse;)V", "id", "", "city", "Lcom/vita/weatherforecast/data/local/entity/CityEntity;", "cnt", "cod", "", "list", "", "Lcom/vita/weatherforecast/data/remote/response/WeatherList;", "message", "(ILcom/vita/weatherforecast/data/local/entity/CityEntity;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getCity", "()Lcom/vita/weatherforecast/data/local/entity/CityEntity;", "setCity", "(Lcom/vita/weatherforecast/data/local/entity/CityEntity;)V", "getCnt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCod", "()Ljava/lang/String;", "getId", "()I", "getList", "()Ljava/util/List;", "getMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILcom/vita/weatherforecast/data/local/entity/CityEntity;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/vita/weatherforecast/data/local/entity/WeatherLocationEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class WeatherLocationEntity implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Embedded
    private com.vita.weatherforecast.data.local.entity.CityEntity city;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cnt")
    private final java.lang.Integer cnt = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cod")
    private final java.lang.String cod = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "list")
    private final java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> list = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "message")
    private final java.lang.Integer message = null;
    public static final android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.WeatherLocationEntity> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.WeatherLocationEntity copy(int id, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.CityEntity city, @org.jetbrains.annotations.Nullable
    java.lang.Integer cnt, @org.jetbrains.annotations.Nullable
    java.lang.String cod, @org.jetbrains.annotations.Nullable
    java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> list, @org.jetbrains.annotations.Nullable
    java.lang.Integer message) {
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
    
    public WeatherLocationEntity(int id, @org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.CityEntity city, @org.jetbrains.annotations.Nullable
    java.lang.Integer cnt, @org.jetbrains.annotations.Nullable
    java.lang.String cod, @org.jetbrains.annotations.Nullable
    java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> list, @org.jetbrains.annotations.Nullable
    java.lang.Integer message) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.local.entity.CityEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.local.entity.CityEntity getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.CityEntity p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCnt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMessage() {
        return null;
    }
    
    @androidx.room.Ignore
    public WeatherLocationEntity(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.remote.response.WeatherLocationResponse weatherLocationResponse) {
        super();
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
    public static final class Creator implements android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.WeatherLocationEntity> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.WeatherLocationEntity createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.WeatherLocationEntity[] newArray(int size) {
            return null;
        }
    }
}