package lesson_6;




import java.io.*;
import java.net.URL;


public class WeatherInStavropol {
    public static void main(String[] args) throws IOException {

            URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295609?apikey=8b950T2IfWAvleLpd7lYzVo9D02iljP6&metric=true");

        InputStream in = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

        }

        bufferedReader.close();


        }
}
