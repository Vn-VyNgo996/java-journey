public class DayOne {
    public static void main(string[] args) {
        // Các Kiểu dữ liệu nguyên thủy (Primitive Types)
        /*
        byte (8 bit)
        short (16 bit)
        int  (32 bit)
        long long (64 bit)
        float (32 bit)
        double (64 bit)
        char (16 bit)
        boolean (1 bit) True or False
         */

        // Khai báo [Kiểu dữ liệu] tên_Biến = giá_trị
        int a = 10;
        long b = 100000000;
        float c = 19.2f;
        double d = 20.5;
        char e = 'a';

        // Kiểu tham chiếu String - chuỗi
        String str = "Văn Bản";

        // In ra màn hình
        //System.out.print(); - In dữ liệu ra màn hình không xuống dòng ở cuối
        System.out.println("Xin Chào");
        System.out.println("Java");
        // Kết quả : Xin Chào Java

        //System.out.println(); - In dữ liệu ra màn hình xuống dòng ở cuối
        System.out.println("Dòng 1");
        System.out.println("Dòng 2");
        /*
        Kết quả : Dòng 1
                  Dòng 2
         */

        //System.out.printf(""); - In dữ liệu có định dạng thông quá các ký tự đặc trưng
        String name = "An";
        int age = 20;
        double point = 8.567;
        System.out.printf("Sinh Viên %s , %d Tuổi, Điểm %2f%n" , name, age, point);
        // Kết quả : Sinh Viên An, 20 Tuổi, Điểm 8.57

        // Kiểu dữ liệu cục bộ - Tự định nghĩa kiểu dữ liệu
        var tuoi = 18; // Tự hiểu tuoi là int
        var chuoi = "Nguyễn Văn A"; // Tự hiểu chuoi là String

        // Ép kiểu
        int i1 = 10;
        double d1 = i1; // Ép kiểu ngầm định từ int sang double
        // Kết quả : 10.0

        double d2 = 9.81;
        int i2 = (int) d2; // Ép kiểu tường minh từ double sang int
        // Kết quả : 9

        // Chia nguyên
        int x = 5;
        int y = 2;
        System.out.println(x / y);



        // Bài tập 1 : Đổi từ °C sang °F
        double celsius = 25.0;
        double fahrenheit = celsius * (9.0/5) + 32;
        System.out.println("°C sang °F : " + fahrenheit);

        // Bài tập 2 : Tính tổng các chữ số của một số nguyên
        int number = 1234;
        int result = 0;
        while (number > 0){
             result += number % 10;
             number /= 10;
        }
        System.out.println("Tổng các chữ số " + result);

        // Bài tập 3: Đổi số giây sang định dạng giờ:phút:giây
        int second = 3665;
        int hour = second / 3600;
        second %= 3600;
        int minute = second / 60;
        second %= 60;
        System.out.println(hour + " hh : " +minute+ " mm : " + second + " ss");

    }
}
