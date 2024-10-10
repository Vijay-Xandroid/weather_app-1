-if class com.vita.weatherforecast.data.remote.response.Weather
-keepnames class com.vita.weatherforecast.data.remote.response.Weather
-if class com.vita.weatherforecast.data.remote.response.Weather
-keep class com.vita.weatherforecast.data.remote.response.WeatherJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
