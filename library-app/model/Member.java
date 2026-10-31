package model;

public abstract class Member {
    private final String id;
    private final String name;
    private final String SĐT;

    public Member(String id, String name, String SĐT){
        if(id == null || id.isEmpty() || id.isBlank()){
            throw new IllegalArgumentException("Lỗi : Id MemBer Không Hợp Lệ");
        }
        if(name == null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Lỗi : Tên Người Dùng Không Hợp Lệ");
        }
        if(SĐT == null || SĐT.isEmpty() || SĐT.isBlank()){
            throw new IllegalArgumentException("Lỗi : SĐT Không Hợp Lệ");
        }
        this.id = id;
        this.name = name;
        this.SĐT = SĐT;
    }

    public String getId(){ return  id; }
    public String getName(){ return name; }
    public String getSĐT(){ return  SĐT; }

    //Abstract
    public abstract int maxBook();
    public abstract long lateFeePerDate();
    public long calculateLateFee(int lateDay){
        return Math.max(0,lateDay) + lateFeePerDate();
    }
}
