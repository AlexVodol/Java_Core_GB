package lesson_7;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.URL;

public class WeatherApi {
    public static final String tokenCity = "8b950T2IfWAvleLpd7lYzVo9D02iljP6";
    public static final String LANGUAGE = "ru";
    public static final String METRIC = "true";
    public String weatherJson(String city) throws IOException {


        OkHttpClient okHttpClient = new OkHttpClient();

        CityCoordinates cityCoordinates = new CityCoordinates();
        String coord = cityCoordinates.getCityCoordinates(city);
        String[] coordinates = coord.split(" ");

//("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295609?apikey=8b950T2IfWAvleLpd7lYzVo9D02iljP6&language=ru&metric=true");

        HttpUrl apiUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
//                .addPathSegment("", coordinates)
                .addQueryParameter("apikey", tokenCity)
                .addQueryParameter("language", LANGUAGE)
                .addQueryParameter("metric", METRIC)
                .build();
        Request requestWeather = new Request.Builder()
                .url(apiUrl)
                .build();
        System.out.println(requestWeather);


        Response responseBooking = okHttpClient.newCall(requestWeather).execute();
        System.out.println(responseBooking.code());
        System.out.println(responseBooking.headers());
        assert responseBooking.body() != null;
        System.out.println(responseBooking.body().string());
        return responseBooking.body().string();
    }
}
