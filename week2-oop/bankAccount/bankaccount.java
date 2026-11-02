package bankAccount;

public class bankaccount {
    // Thuộc tính
    // sử dụng private - Tính đóng gói
    private double balance;

    // Construcotr
    public bankaccount(double balance){
        if(balance < 0){
            throw new IllegalArgumentException("Lỗi : Số Dư Không Hợp Lệ.");
        }
        this.balance = balance;
    }

    public double getBalance(){ return balance;}

   // Nạp
    public void deposit(double monney){
        if(monney <= 0){
            throw new IllegalArgumentException("Lỗi : Tiền Nạp Không Hợp Lệ");
        }
        this.balance = getBalance() + monney;
    }

    // Rút
    public void withdraw(double monney){
        if(monney < 0){
            throw new IllegalArgumentException("Lỗi : Tiền Rút Phải Lớn Hơn 0.");
        }
        if(getBalance() < monney){
            throw new IllegalStateException("Lỗi : Số Dư Không Đủ Để Rút.");
        }
        this.balance = getBalance() - monney;
    }

    // Chuyển
    public void trasfer(bankaccount Account, double monney){
        if(Account == null){
            throw new IllegalArgumentException("Lỗi : Tài Khoản Nhận Tiền Không Hợp Lệ.");
        }
        withdraw(monney);
        Account.deposit(monney);
        System.out.println("Chuyển Tiền Thành Công.");
    }

    public void disPlay(){
        System.out.println("Số Dư Hiện Tại : " + getBalance());
    }


}
