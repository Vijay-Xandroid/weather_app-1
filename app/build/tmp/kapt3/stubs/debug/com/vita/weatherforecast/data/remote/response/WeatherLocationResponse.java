package com.vita.weatherforecast.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/vita/weatherforecast/data/remote/response/WeatherLocationResponse;", "", "city", "Lcom/vita/weatherforecast/data/remote/response/City;", "cnt", "", "cod", "", "list", "", "Lcom/vita/weatherforecast/data/remote/response/WeatherList;", "message", "(Lcom/vita/weatherforecast/data/remote/response/City;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getCity", "()Lcom/vita/weatherforecast/data/remote/response/City;", "getCnt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCod", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getMessage", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/vita/weatherforecast/data/remote/response/City;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/vita/weatherforecast/data/remote/response/WeatherLocationResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class WeatherLocationResponse {
    @org.jetbrains.annotations.Nullable
    private final com.vita.weatherforecast.data.remote.response.City city = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer cnt = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String cod = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> list = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer message = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.vita.weatherforecast.data.remote.response.WeatherLocationResponse copy(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.remote.response.City city, @org.jetbrains.annotations.Nullable
    java.lang.Integer cnt, @org.jetbrains.annotations.Nullable
    java.lang.String cod, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "list")
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
    
    public WeatherLocationResponse(@org.jetbrains.annotations.Nullable
    com.vita.weatherforecast.data.remote.response.City city, @org.jetbrains.annotations.Nullable
    java.lang.Integer cnt, @org.jetbrains.annotations.Nullable
    java.lang.String cod, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "list")
    java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> list, @org.jetbrains.annotations.Nullable
    java.lang.Integer message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.City component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.vita.weatherforecast.data.remote.response.City getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCnt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.vita.weatherforecast.data.remote.response.WeatherList> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMessage() {
        return null;
    }
}