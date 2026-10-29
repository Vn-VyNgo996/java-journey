package model;

public class StudentMemBer extends Member {
    public StudentMemBer(String id, String name, String SĐT){
        super(id, name, SĐT);
    }

    // SinhVien/HocSinh/customer được mượn 3cuon/1 lần
    @Override
    public int maxBook() {
        return 3;
    }

    // Hạn phí trả muộn 2_000
    @Override
    public long lateFeePerDate() {
        return 2_000;
    }
}
