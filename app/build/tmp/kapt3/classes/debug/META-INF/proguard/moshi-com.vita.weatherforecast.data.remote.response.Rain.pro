-if class com.vita.weatherforecast.data.remote.response.Rain
-keepnames class com.vita.weatherforecast.data.remote.response.Rain
-if class com.vita.weatherforecast.data.remote.response.Rain
-keep class com.vita.weatherforecast.data.remote.response.RainJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
