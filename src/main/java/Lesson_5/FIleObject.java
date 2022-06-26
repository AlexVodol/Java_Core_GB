package Lesson_5;

public class FIleObject {

    private final Integer value;
    private final Integer valueFrom;
    private final Integer valueTo;

    public FIleObject(Integer value, Integer valueFrom, Integer valueTo) {
        this.value = value;
        this.valueFrom = valueFrom;
        this.valueTo = valueTo;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getValueFrom() {
        return valueFrom;
    }

    public Integer getValueTo() {
        return valueTo;
    }
}
