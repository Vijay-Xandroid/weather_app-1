-if class com.vita.weatherforecast.data.remote.response.Clouds
-keepnames class com.vita.weatherforecast.data.remote.response.Clouds
-if class com.vita.weatherforecast.data.remote.response.Clouds
-keep class com.vita.weatherforecast.data.remote.response.CloudsJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
