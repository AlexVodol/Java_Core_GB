package lesson_7;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class CityCoordinates {

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();


    private static final String tokenCity = "8b950T2IfWAvleLpd7lYzVo9D02iljP6";


    public String getCityCoordinates(String city) throws IOException {
        while (true) {
// http://dataservice.accuweather.com/locations/v1/cities/search?apikey=8b950T2IfWAvleLpd7lYzVo9D02iljP6&q=Stavropol
            HttpUrl apiUrl = new HttpUrl.Builder()
                    .scheme("http")
                    .host("dataservice.accuweather.com")
                    .addPathSegment("locations")
                    .addPathSegment("v1")
                    .addPathSegment("cities")
                    .addPathSegment("search")
                    .addQueryParameter("apikey", tokenCity)
                    .addQueryParameter("q", city)
                    .build();

            System.out.println(apiUrl);
            Request requestCity = new Request.Builder()
                    .url(apiUrl)
                    .build();
            Response responseCity = okHttpClient.newCall(requestCity).execute();
            assert responseCity.body() != null;
            String responseCityString = responseCity.body().string();
            System.out.println(responseCityString);
            String cityCoordinates = objectMapper.readTree(responseCityString).at("/response/GeoObjectCollection/featureMember/0/GeoObject/Point/pos").asText();
            System.out.println(cityCoordinates);
            return cityCoordinates;
        }

    }
}
