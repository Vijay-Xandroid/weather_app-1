-if class com.vita.weatherforecast.data.remote.response.Coord
-keepnames class com.vita.weatherforecast.data.remote.response.Coord
-if class com.vita.weatherforecast.data.remote.response.Coord
-keep class com.vita.weatherforecast.data.remote.response.CoordJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
