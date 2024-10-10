-if class com.vita.weatherforecast.domain.model.WeatherListDomain
-keepnames class com.vita.weatherforecast.domain.model.WeatherListDomain
-if class com.vita.weatherforecast.domain.model.WeatherListDomain
-keep class com.vita.weatherforecast.domain.model.WeatherListDomainJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
