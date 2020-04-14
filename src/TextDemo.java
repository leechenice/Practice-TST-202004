import java.util.Arrays;

public class TextDemo {
    public static void move(char a,char b) {
        System.out.println(a + " -> " + b + " ");
    }
    public static void hanoi(int n,char a,char b,char c) {
        if(n == 1) {
            move(a,c);
        }else {
            hanoi(n - 1,a,c,b);
            move(a,c);
            hanoi(n - 1,b,a,c);
        }
    }
    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
//    public static void myToString(int[] arr) {
//        for (int i = 0; i <arr.length ; i++) {
//            if(i == 0) {
//                System.out.print("[" + arr[i] + ",");
//            }else if(i == arr.length -1) {
//                System.out.print(arr[i] + "]");
//            }else {
//                System.out.print(arr[i] + ",");
//            }
//        }
//    }
    public static String myToString(int [] arr) {
        String ret = "[";
        for (int i = 0; i <arr.length ; i++) {
            ret += arr[i];
            if(i != arr.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void foundOnly(int[] arr) {

        for (int i = 0; i <arr.length ; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
    public static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int factorial(int n) {
        int tmp = 0;
        for (int i = 1; i <= n; i++) {
            tmp += i;
        }
        return tmp;
    }

    public  static int factorialAdd(int n) {
        int tmp = 0;
        for (int i = 1; i <= n; i++) {
            tmp += factorial(i);
        }
        return tmp;
    }

    public static void parityOrder(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            while (arr[left] % 2 != 0) {
                left++;
            }
            while(arr[right] % 2 == 0) {
                right--;
            }
            if(left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static int max3(int a,int b,int c){
        int ret = max2(a,b);
        return max2(b,c);
    }
    public static void max2(int a,double b,double c) {
        if(a < b) {
            int tmp = a;
            a = (int)b;
            b = tmp;
        }
        if(a < c) {
            int tmp = a;
            a = (int)c;
            c = tmp;
        }
        if(b < c) {
            double tmp = b;
            b = c;
            c = tmp;
        }
    }
    public static double max2(double a,double b) {
        return Math.max(a,b);
    }

    public static int max2(int a,int b) {
        return Math.max(a, b);
    }
    public static double sumNum(double a,double b,double c) {
        return a + b + c;
    }
    public static int sumNum(int a,int b) {
        return a + b;
    }
    public static double avg(int[] arr) {
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
//        return sum / arr.length;
    }
    public static void  transform(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i] * 2;
        }
    }
    public static void printArray(int[] arr) {
        for (int x:arr
             ) {
            System.out.println(x);
        }
    }
    public static void assignment(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i + 1;
        }
    }
    public static void main(String[] args) {
//        int[] array = new int[100];
//        assignment(array);
//        System.out.println(Arrays.toString(array));
//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        printArray(array);
//        transform(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(avg(array));
//        int[] array = {1,2,3,4,5,6,7,8,9};
//        parityOrder(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(factorial(5));
//        System.out.println(factorialAdd(5));
//        System.out.println(fib(20));
//        int[] array = {1,1,2,2,3,3,4,4,5,5,6};
//        foundOnly(array);

//        hanoi(5,'a','b','c');
//        int[] array = {1,2,3,4};
//        System.out.println(array.length);
//        for (int i = 0; i <array.length ; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int q:array) {
//            System.out.print(q + " ");
//        }
//        int[] arr ={0,1};
//        System.out.println(arr[0] + " " + arr[1]);
//        swap(arr);
//        System.out.println(arr[0] + " " + arr[1]);
//        int [] arr = {1};
//        System.out.println(Arrays.toString(arr));
//        int[] array = {12,34,123,345,56,67,67,3,12};
//        System.out.println(myToString(array));
    }
}

