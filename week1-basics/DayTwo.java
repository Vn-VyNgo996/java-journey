public class DayTwo {
    public static void main(string[] args) {
        // Cấu trúc rẽ nhánh
        double point = 7.0;
        if(point >= 8.0){
            System.out.println("Học Sinh Giỏi");
        }else if (point < 8.0 && point >= 6.5){
            System.out.println("Học Sinh Khá");
        }else{
            System.out.println("Học Sinh Yếu");
        }
        //switch dạng biểu thức (->)
        int month = 9;
        int daysInMonth = switch (month){
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;

            default -> 31;
        };
        System.out.println(daysInMonth);
        // biểu thức này giúp trách break

        // Không Được Phép dán nhiều nhãn lên vỏ hộp
        int value = 5;
        switch (value){
            // case 1 một câu phát biểu
            case 1 -> System.out.println("Value is 1");

            // case 2 -> case 3 -> System.out.println("Value is 2"); // Not allowed
            case 2, 3 -> System.out.println("Value is 2"); // This is OK

            // case 5 một khối câu lệnh
            case 5 -> {
                System.out.println("Value is 5");
                System.out.println("This line will compile");
            }
            default -> System.out.println("Value doesn't match any of the constants");
        }


        // Bài tập 1 : fizzBuzz
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }




    }
}
