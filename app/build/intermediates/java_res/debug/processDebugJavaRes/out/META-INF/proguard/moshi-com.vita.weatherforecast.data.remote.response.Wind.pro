-if class com.vita.weatherforecast.data.remote.response.Wind
-keepnames class com.vita.weatherforecast.data.remote.response.Wind
-if class com.vita.weatherforecast.data.remote.response.Wind
-keep class com.vita.weatherforecast.data.remote.response.WindJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
