package Polymorphism;

public abstract class MemBer {
    private final String id;
    private final String name;

    protected MemBer(String id, String name){
        this.id  = id;
        this.name = name;
    }

    public String getId(){ return  id;}
    public String getName(){ return name;}

    public abstract int maxBooks();
    public abstract long lateFeePerDay();
    public long calculateLateFee(int lateDays){
        return Math.max(0, lateDays) * lateFeePerDay();
    }
}
