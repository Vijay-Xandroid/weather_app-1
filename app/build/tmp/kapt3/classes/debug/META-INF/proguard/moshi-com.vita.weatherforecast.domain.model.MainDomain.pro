-if class com.vita.weatherforecast.domain.model.MainDomain
-keepnames class com.vita.weatherforecast.domain.model.MainDomain
-if class com.vita.weatherforecast.domain.model.MainDomain
-keep class com.vita.weatherforecast.domain.model.MainDomainJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
