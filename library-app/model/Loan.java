package model;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Loan {
    public static final int LOAN_DAYS = 14;

    private final String meberId;
    private final String isbn;
    private final LocalDate brrowedOn;

    public Loan(String memberId, String isbn, LocalDate brrowedOn){

            this.meberId = memberId ;
            this.isbn = isbn;
            this.brrowedOn = brrowedOn;
    }

    public LocalDate dueDate(){
        return  brrowedOn.plusDays(LOAN_DAYS);
    }

    public long lacalDays(LocalDate returnedON){
        return Math.max(0, ChronoUnit.DAYS.between(dueDate(), returnedON));
    }


    public String getMeberId(){
        return meberId;
    }
    public String getIsbn(){return isbn; }
}
