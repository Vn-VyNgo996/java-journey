package model;

public class VIPMember extends Member {
    public VIPMember(String id, String name, String SĐT){
        super(id, name, SĐT);
    }

    // VIP được mượn 10cuon /1 lần
    @Override
    public int maxBook() {
        return 10;
    }

    // VIP miễn phí hạn trễ
    @Override
    public long lateFeePerDate() {
        return 0;
    }

    public enum genre {
    }
}
