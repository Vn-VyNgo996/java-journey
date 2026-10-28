package bankAccount;

public class Money implements Comparable<Money> {
  private final long amount;


  public Money(long amount){
      if(amount < 0){
          throw new IllegalArgumentException("Lỗi : Tiền Không Hợp Lệ.");
      }
      this.amount = amount;
  }

  public long getAmount(){ return amount;}

  public Money add(Money other){
      if(other == null){
          throw new IllegalArgumentException("Lỗi : Đối Tượng Truyền Vào Không Có.");
      }
      return new Money(this.amount + other.amount);
  }

  public Money subtract(Money other){
      if (other == null || this.amount < other.amount){
          throw new IllegalArgumentException("Lỗi : Số Dư Hoặc Đối Tượng Không Đúng.");
      }
      return new Money(this.amount - other.amount);
  }

    @Override
    public int compareTo(Money o) {
        return Long.compare(this.amount, o.amount);
    }


}
