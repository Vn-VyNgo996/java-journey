package Enum;

public enum Gener {
    NOVEl("Tiểu Thuyết"),
    SCIENCE("Khoa Học"),
    HISTORY("Lịch Sử");

    private final String displayName;

    Gener(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
