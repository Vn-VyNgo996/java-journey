package Polymorphism;

public class VIPMember extends MemBer{
    public VIPMember(String id, String name){
        super(id, name);
    }

    @Override
    public int maxBooks() {
        return 10;
    }

    @Override
    public long lateFeePerDay() {
        return 0;
    }


}
