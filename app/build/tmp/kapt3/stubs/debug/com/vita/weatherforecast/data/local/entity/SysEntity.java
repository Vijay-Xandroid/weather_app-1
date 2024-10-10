package com.vita.weatherforecast.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Sys")
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/vita/weatherforecast/data/local/entity/SysEntity;", "Landroid/os/Parcelable;", "sys", "Lcom/vita/weatherforecast/data/remote/response/Sys;", "(Lcom/vita/weatherforecast/data/remote/response/Sys;)V", "pod", "", "(Ljava/lang/String;)V", "getPod", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class SysEntity implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String pod = null;
    public static final android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.SysEntity> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.local.entity.SysEntity copy(@org.jetbrains.annotations.Nullable
    java.lang.String pod) {
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
    
    public SysEntity(@org.jetbrains.annotations.Nullable
    java.lang.String pod) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPod() {
        return null;
    }
    
    @androidx.room.Ignore
    public SysEntity(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.remote.response.Sys sys) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.vita.weatherforecast.data.local.entity.SysEntity> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.SysEntity createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.vita.weatherforecast.data.local.entity.SysEntity[] newArray(int size) {
            return null;
        }
    }
}