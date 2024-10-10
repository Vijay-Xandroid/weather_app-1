package com.vita.weatherforecast.utils.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0018J\b\u0010\'\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010(\u001a\u00020\u0018J\u0014\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001eH\u0016J\u0010\u00100\u001a\u00020.2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020.2\u0006\u00101\u001a\u000202H\u0016J \u00104\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0017J\u0006\u00109\u001a\u00020.J\u0006\u0010:\u001a\u00020.R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c\u00a8\u0006<"}, d2 = {"Lcom/vita/weatherforecast/utils/extension/GpsTracker;", "Landroid/app/Service;", "Landroid/location/LocationListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "canGetLocation", "", "getCanGetLocation", "()Z", "setCanGetLocation", "(Z)V", "isGPSEnabled", "setGPSEnabled", "isNetworkEnabled", "setNetworkEnabled", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "setLocationManager", "(Landroid/location/LocationManager;)V", "mContext", "userLatitude", "", "getUserLatitude", "()D", "setUserLatitude", "(D)V", "userLocation", "Landroid/location/Location;", "getUserLocation", "()Landroid/location/Location;", "setUserLocation", "(Landroid/location/Location;)V", "userLongitude", "getUserLongitude", "setUserLongitude", "getLatitude", "getLocation", "getLongitude", "onBind", "Landroid/os/IBinder;", "arg0", "Landroid/content/Intent;", "onLocationChanged", "", "location", "onProviderDisabled", "provider", "", "onProviderEnabled", "onStatusChanged", "status", "", "extras", "Landroid/os/Bundle;", "showSettingsAlert", "stopUsingGPS", "Companion", "app_debug"})
public class GpsTracker extends android.app.Service implements android.location.LocationListener {
    private final android.content.Context mContext = null;
    private boolean isGPSEnabled = false;
    private boolean isNetworkEnabled = false;
    private boolean canGetLocation = false;
    @org.jetbrains.annotations.Nullable
    private android.location.Location userLocation;
    private double userLatitude = 0.0;
    private double userLongitude = 0.0;
    @org.jetbrains.annotations.Nullable
    private android.location.LocationManager locationManager;
    @org.jetbrains.annotations.NotNull
    public static final com.vita.weatherforecast.utils.extension.GpsTracker.Companion Companion = null;
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10L;
    private static final long MIN_TIME_BW_UPDATES = 60000L;
    
    public GpsTracker(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final boolean isGPSEnabled() {
        return false;
    }
    
    public final void setGPSEnabled(boolean p0) {
    }
    
    public final boolean isNetworkEnabled() {
        return false;
    }
    
    public final void setNetworkEnabled(boolean p0) {
    }
    
    public final boolean getCanGetLocation() {
        return false;
    }
    
    public final void setCanGetLocation(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.location.Location getUserLocation() {
        return null;
    }
    
    public final void setUserLocation(@org.jetbrains.annotations.Nullable
    android.location.Location p0) {
    }
    
    public final double getUserLatitude() {
        return 0.0;
    }
    
    public final void setUserLatitude(double p0) {
    }
    
    public final double getUserLongitude() {
        return 0.0;
    }
    
    public final void setUserLongitude(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.location.LocationManager getLocationManager() {
        return null;
    }
    
    public final void setLocationManager(@org.jetbrains.annotations.Nullable
    android.location.LocationManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.location.Location getLocation() {
        return null;
    }
    
    /**
     * Stop using GPS listener
     * Calling this function will stop using GPS in your app
     */
    public final void stopUsingGPS() {
    }
    
    /**
     * Function to get latitude
     */
    public final double getLatitude() {
        return 0.0;
    }
    
    /**
     * Function to get longitude
     */
    public final double getLongitude() {
        return 0.0;
    }
    
    /**
     * Function to check GPS/wifi enabled
     * @return boolean
     */
    public final boolean canGetLocation() {
        return false;
    }
    
    /**
     * Function to show settings alert dialog
     * On pressing Settings button will lauch Settings Options
     */
    public final void showSettingsAlert() {
    }
    
    @java.lang.Override
    public void onLocationChanged(@org.jetbrains.annotations.NotNull
    android.location.Location location) {
    }
    
    @java.lang.Override
    public void onProviderDisabled(@org.jetbrains.annotations.NotNull
    java.lang.String provider) {
    }
    
    @java.lang.Override
    public void onProviderEnabled(@org.jetbrains.annotations.NotNull
    java.lang.String provider) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onStatusChanged(@org.jetbrains.annotations.NotNull
    java.lang.String provider, int status, @org.jetbrains.annotations.NotNull
    android.os.Bundle extras) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent arg0) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/vita/weatherforecast/utils/extension/GpsTracker$Companion;", "", "()V", "MIN_DISTANCE_CHANGE_FOR_UPDATES", "", "MIN_TIME_BW_UPDATES", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}