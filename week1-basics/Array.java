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

    public static double averagePositive(int nums[]){
          int sum = 0;
          int count = 0;
          for(int i = 0 ; i < nums.length; i++){
              if(nums[i] > 0){
                  sum += nums[i];
                  count++;
              }
          }
          if(count == 0){
              return 0;
          }
          return (double) sum /count;
    }
    public static int secondLargest(int []nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int x : nums){
            if(x > first){
                second = first;
                first = x;
            }else if(x > second && x < first){
                second = x;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        System.out.println(averagePositive(new int[] {3, -1, 4 ,2 ,1}));
        System.out.println(averagePositive(new int[] {-5 ,  -2}));
        System.out.println(secondLargest(new int[]{5 ,5 ,3}));
        System.out.println(secondLargest(new int[]{1,9,4,9}));
    }
}
