-if class com.vita.weatherforecast.data.remote.response.Sys
-keepnames class com.vita.weatherforecast.data.remote.response.Sys
-if class com.vita.weatherforecast.data.remote.response.Sys
-keep class com.vita.weatherforecast.data.remote.response.SysJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
