import java.util.Arrays;

public class Array {

    // Tìm min
    public static int minArray(int []arr){
        int minV = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minV){
                minV = arr[i];
            }
        }
        return minV;
    }

    public static int maxArray(int []arr){
        int maxV = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxV){
                maxV = arr[i];
            }
        }
        return maxV;
    }

    // Swap
    public static void swap(int a , int b){
        int res = a;
        a = b;
        b = res;
    }

    public static void daoMang(int []arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int res = arr[left];
            arr[left] = arr[right];
            arr[right] = res;

            left++;
            right--;
        }
    }

    // Đảo mảng k lần
    public static void daoMang(int []arr, int left, int right){
        while(left < right){
            int res = arr[left];
            arr[left] = arr[right];
            arr[right] = res;

            left++;
            right--;
        }
    }

    public static void rotateRight(int []arr, int k){
        int n = arr.length;
        if(n == 0){
            return;
        }
        k =((k % n) + n) % n;

        // Bước 1: Đảo toàn bộ mảng
        daoMang(arr, 0, n - 1);
        // Bước 2: Đảo phần tử tại k
        daoMang(arr, 0, k - 1);
        // Bước 3: Đảo các phần từ còn lại
        daoMang(arr, k, n - 1);
    }

    public static void rotateLeft(int []arr, int k){
        int n = arr.length;
        if(n == 0){
            return;
        }
        k = ((k % n) + n) % n;
        daoMang(arr, 0, k - 1);
        daoMang(arr, 0, n - 1);
        daoMang(arr, 0, (n - 1) - k);

    }
    public static void main(string[] args) {
        // Khai báo mảng
        int arr[] = new int[]{1, 2, 3, 4, 5};

        // truy cập tại vị trí mảng 0 -> arr - 1
        System.out.println("Giá trị tại vị trị thứ 2 : " + arr[2]);

        // thay đổi giá trị mảng
        arr[1] = 100;

        // duyệt mảng
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // Gọi method tìm min
        int resultMin = minArray(arr);
        System.out.println("Giá trị Min trong mảng: " + resultMin);

        // Gọi method tìm max
        int resultMax = maxArray(arr);
        System.out.println("Giá trị Max trong mảng: " +resultMax);

        // Gọi method đảo mảng
        daoMang(arr);
        System.out.println(Arrays.toString(arr));

        rotateRight(arr, 2);
        System.out.println(Arrays.toString(arr));

        int []arr1 = new int[]{1,2,3,4,5};
        rotateLeft(arr1, 2);
        System.out.println(Arrays.toString(arr1));


    }
}
