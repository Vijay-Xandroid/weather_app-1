-if class com.vita.weatherforecast.data.remote.response.WeatherLocationResponse
-keepnames class com.vita.weatherforecast.data.remote.response.WeatherLocationResponse
-if class com.vita.weatherforecast.data.remote.response.WeatherLocationResponse
-keep class com.vita.weatherforecast.data.remote.response.WeatherLocationResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.vita.weatherforecast.data.remote.response.WeatherLocationResponse
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.vita.weatherforecast.data.remote.response.WeatherLocationResponse
-keepclassmembers class com.vita.weatherforecast.data.remote.response.WeatherLocationResponse {
    public synthetic <init>(com.vita.weatherforecast.data.remote.response.City,java.lang.Integer,java.lang.String,java.util.List,java.lang.Integer,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
