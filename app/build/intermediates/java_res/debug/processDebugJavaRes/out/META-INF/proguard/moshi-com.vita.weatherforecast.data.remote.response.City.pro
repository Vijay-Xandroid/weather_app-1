-if class com.vita.weatherforecast.data.remote.response.City
-keepnames class com.vita.weatherforecast.data.remote.response.City
-if class com.vita.weatherforecast.data.remote.response.City
-keep class com.vita.weatherforecast.data.remote.response.CityJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
