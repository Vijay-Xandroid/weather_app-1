package com.vita.weatherforecast.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/vita/weatherforecast/utils/NetworkUtils;", "", "()V", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "app_debug"})
public final class NetworkUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.vita.weatherforecast.utils.NetworkUtils INSTANCE = null;
    
    private NetworkUtils() {
        super();
    }
    
    @kotlin.jvm.JvmStatic
    public static final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
}