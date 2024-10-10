-if class com.vita.weatherforecast.data.remote.response.WeatherList
-keepnames class com.vita.weatherforecast.data.remote.response.WeatherList
-if class com.vita.weatherforecast.data.remote.response.WeatherList
-keep class com.vita.weatherforecast.data.remote.response.WeatherListJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
