import java.util.Arrays;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        // String<StringPool> - Bất Biến
        // Khi tạo ra giá trị của đối tượng không thể thay đổi
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        // StringBuilder - Có thể thêm, nối, xóa , sữa
        // Ưu điểm : tốt ưu và nhanh chóng trong việc sử lý đơn luồng
        StringBuffer sb = new StringBuffer("An");
        sb.append(" 20 Tuổi");
        String f = sb.toString();
        System.out.println(f);

        // StringBuffer - Chức năng giống như StringBuilder
        // Ưu điểm : an toàn khi sử lý đa luồng, chậm hơn StringBuilder do xử lý khóa đồng bộ
        StringBuffer sb1 = new StringBuffer("An");
        sb1.append("18 Tuổi");
        System.out.println(sb1);


        // Bài tập 1: Đếm Nguyên Âm
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Chuỗi : ");
        String string = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer(string);

        if(stringBuffer == null){
            return;
        }
        String lower = string.toLowerCase();
        int count = 0;
        for(int i = 0; i < stringBuffer.length(); i++) {
            char tmp = lower.charAt(i);
            if (tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o' || tmp == 'u') {
                count++;
            }
        }
        System.out.println("Số nguyên âm trong chuỗi : " + count);

        // Bài 2 : Kiểm tra Anagram (Hai chuỗi có cùng tập ký tự hay không)
        String c1 = "listen";
        String c2 = "silent";

        char []arr1 = c1.toLowerCase().toCharArray();
        char []arr2 = c2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("2 Chuỗi có cùng tập ký tự");
        }else {
            System.out.println("2 Chuỗi không cùng tập ký tự");
        }

        // Bài 3 : Đảo thứ tự từ trong câu
        String chuoi = "Học Lập Trình Java";

        // dùng split() để tách câu thành mảng dựa vào khoảng trắng
        String[] words = chuoi.strip().split("\\s+");
        StringBuilder result1 = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            result1.append(words[i]);
            if(i != 0){
                result1.append(" ");
            }
        }
        System.out.println("Câu Đảo : " +result1.toString());
    }

}
