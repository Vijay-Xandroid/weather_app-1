-if class com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain
-keepnames class com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain
-if class com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain
-keep class com.vita.weatherforecast.domain.model.WeatherLocationResponseDomainJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain
-keepclassmembers class com.vita.weatherforecast.domain.model.WeatherLocationResponseDomain {
    public synthetic <init>(com.vita.weatherforecast.domain.model.CityDomain,java.lang.Integer,java.lang.String,java.util.List,java.lang.Integer,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
