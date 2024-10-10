-if class com.vita.weatherforecast.data.remote.response.Main
-keepnames class com.vita.weatherforecast.data.remote.response.Main
-if class com.vita.weatherforecast.data.remote.response.Main
-keep class com.vita.weatherforecast.data.remote.response.MainJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
