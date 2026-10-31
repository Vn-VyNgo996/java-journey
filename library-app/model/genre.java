package model;

public enum genre {
    NOVEL("TIỂU THUYẾT"),
    SCIENCE("KHOA HỌC"),
    HISTORY("LỊCH SỬ");

    private final String displayName;
    genre(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
