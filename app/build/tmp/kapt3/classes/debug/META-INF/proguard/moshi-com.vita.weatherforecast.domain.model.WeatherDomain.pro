-if class com.vita.weatherforecast.domain.model.WeatherDomain
-keepnames class com.vita.weatherforecast.domain.model.WeatherDomain
-if class com.vita.weatherforecast.domain.model.WeatherDomain
-keep class com.vita.weatherforecast.domain.model.WeatherDomainJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
