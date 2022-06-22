package lesson_7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Fact {

    private int temp;
    private String condition;


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getCondition() {
        switch (this.condition) {
            case "overcast" -> condition = "пасмурно";
            case "clear" -> condition = "ясно";
            case "rain" -> condition = "дождь";
            case "cloudy" -> condition = "облачно с прояснениями";
            case "partly-cloudy" -> condition = "малооблачно";
            default -> {
            }
        }
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
