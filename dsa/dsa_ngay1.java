import java.util.Random;
import java.util.Scanner;

public class dsa_ngay1 {
    public static double temperature (double c){
        return c * ((double) 9/5) + 32;
    }

    public static int sumDigits(int n){
        if(n < 0){
            n = -n;
        }
        if(n < 10){
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void converSecond (int second){
        if(second < 0){
            return;
        }
        int hour = second / 3600;
        second %= 3600;
        int minute = second / 60;
        second %= 60;
        System.out.println(hour + ":" + minute + ":" + second);

    }

    public static double pointGPA(int point1, int point2, int point3){
        if((point1 >= 0 && point1 <= 10) && (point2 >= 0 && point2 <= 10) && (point3 >= 0 && point3 <= 10)){
            return (double)(point1 + point2 + point3) / 3;
        }
        return 0;
    }

    public static void fizzBuzz(int n){
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime (int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void cuuChuong(int n){
        for(int i = 1; i < 10; i++){
            System.out.println(n + " x " + i + " = " + i * n);
        }
    }

    public static void gameRondom(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int number = rd.nextInt(10);
        int limit = 1;
        do{
            System.out.print("Nhập 1 số bạn đoán : ");
            int slect = sc.nextInt();
            if(slect < 0 || slect > 100){
                System.out.println("Nhập Số Trong Khoảng [0 -> 100]");
            }else {
                if (slect > number) {
                    System.out.println("Thấp hơn");
                    limit++;
                } else if (slect < number) {
                    System.out.println("Cao hơn");
                    limit++;
                } else if (slect == number) {
                    System.out.println("Bạn Đã Đoán Đúng!!!");
                    return;
                }
            }
        }while(limit <= 5);
        System.out.println("Đã Hết Lượt Đoán!");
    }

    public static void numberToZero(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println("Số Đã = 0");
        }
        int tmp = n;
        for(int i = 1; i <= n; i++){
            if(tmp == 0){
                break;
            }else {
                if (tmp % 2 == 0) {
                    System.out.println("Bước " + i + ") " + tmp + " : is even ; divide by 2 and obtain " + tmp / 2);
                    tmp /= 2;
                } else if (tmp % 2 != 0) {
                    System.out.println("Bước " + i + ") " + tmp + " : is odd ; subtract by 1 and obtain " + (tmp - 1));
                    tmp -= 1;
                }
            }
        }
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
    }
}
