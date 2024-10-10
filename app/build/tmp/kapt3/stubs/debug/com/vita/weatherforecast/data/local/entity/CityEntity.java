package com.vita.weatherforecast.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "CityName")
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BU\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010-\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010.\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010/\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJn\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u00101J\t\u00102\u001a\u00020\nH\u00d6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\u0006\u00107\u001a\u00020\bJ\t\u00108\u001a\u00020\nH\u00d6\u0001J\t\u00109\u001a\u00020\bH\u00d6\u0001J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\nH\u00d6\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\"\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\"\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001a\"\u0004\b\'\u0010\u001c\u00a8\u0006?"}, d2 = {"Lcom/vita/weatherforecast/data/local/entity/CityEntity;", "Landroid/os/Parcelable;", "city", "Lcom/vita/weatherforecast/data/remote/response/City;", "(Lcom/vita/weatherforecast/data/remote/response/City;)V", "cityCoord", "Lcom/vita/weatherforecast/data/local/entity/CoordEntity;", "cityCountry", "", "cityId", "", "cityName", "cityPopulation", "citySunrise", "citySunset", "cityTimezone", "(Lcom/vita/weatherforecast/data/local/entity/CoordEntity;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCityCoord", "()Lcom/vita/weatherforecast/data/local/entity/CoordEntity;", "setCityCoord", "(Lcom/vita/weatherforecast/data/local/entity/CoordEntity;)V", "getCityCountry", "()Ljava/lang/String;", "setCityCountry", "(Ljava/lang/String;)V", "getCityId", "()Ljava/lang/Integer;", "setCityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCityName", "setCityName", "getCityPopulation", "setCityPopulation", "getCitySunrise", "setCitySunrise", "getCitySunset", "setCitySunset", "getCityTimezone", "setCityTimezone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/vita/weatherforecast/data/local/entity/CoordEntity;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vita/weatherforecast/data/local/entity/CityEntity;", "describeContents", "equals", "", "other", "", "getCityAndCountry", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class CityEntity implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    @androidx.room.Embedded
    private com.vita.weatherforecast.data.local.entity.CoordEntity cityCoord;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cityCountry")
    private java.lang.String cityCountry;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cityId")
    private java.lang.Integer cityId;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cityName")
    private java.lang.String cityName;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cityPopulation")
    private java.lang.Integer cityPopulation;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "citySunrise")
    private java.lang.Integer citySunrise;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "citySunset")
    private java.lang.Integer citySunset;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cityTimezone")
    private java.lang.Integer cityTimezone;
    public static final android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.CityEntity> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.CityEntity copy(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.CoordEntity cityCoord, @org.jetbrains.annotations.Nullable
    java.lang.String cityCountry, @org.jetbrains.annotations.Nullable
    java.lang.Integer cityId, @org.jetbrains.annotations.Nullable
    java.lang.String cityName, @org.jetbrains.annotations.Nullable
    java.lang.Integer cityPopulation, @org.jetbrains.annotations.Nullable
    java.lang.Integer citySunrise, @org.jetbrains.annotations.Nullable
    java.lang.Integer citySunset, @org.jetbrains.annotations.Nullable
    java.lang.Integer cityTimezone) {
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
    
    public CityEntity(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.CoordEntity cityCoord, @org.jetbrains.annotations.Nullable
    java.lang.String cityCountry, @org.jetbrains.annotations.Nullable
    java.lang.Integer cityId, @org.jetbrains.annotations.Nullable
    java.lang.String cityName, @org.jetbrains.annotations.Nullable
    java.lang.Integer cityPopulation, @org.jetbrains.annotations.Nullable
    java.lang.Integer citySunrise, @org.jetbrains.annotations.Nullable
    java.lang.Integer citySunset, @org.jetbrains.annotations.Nullable
    java.lang.Integer cityTimezone) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.local.entity.CoordEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.local.entity.CoordEntity getCityCoord() {
        return null;
    }
    
    public final void setCityCoord(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.local.entity.CoordEntity p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCityCountry() {
        return null;
    }
    
    public final void setCityCountry(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCityId() {
        return null;
    }
    
    public final void setCityId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCityName() {
        return null;
    }
    
    public final void setCityName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCityPopulation() {
        return null;
    }
    
    public final void setCityPopulation(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCitySunrise() {
        return null;
    }
    
    public final void setCitySunrise(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCitySunset() {
        return null;
    }
    
    public final void setCitySunset(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCityTimezone() {
        return null;
    }
    
    public final void setCityTimezone(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @androidx.room.Ignore
    public CityEntity(@org.jetbrains.annotations.NotNull
    com.vita.weatherforecast.data.remote.response.City city) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCityAndCountry() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.CityEntity> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.CityEntity createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.CityEntity[] newArray(int size) {
            return null;
        }
    }
}