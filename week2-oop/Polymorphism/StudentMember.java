package Polymorphism;

public class StudentMember extends  MemBer{

    public StudentMember(String id, String name){
        super(id, name);
    }
    @Override
    public int maxBooks() {
        return 3;
    }

    @Override
    public long lateFeePerDay() {
        return 2_000;
    }
}
