package Enum;

public enum Day {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int dayMenber;

    Day(int dayMenber){
        this.dayMenber = dayMenber;
    }

    public int getDayMenber(){
        return this.dayMenber;
    }
}
