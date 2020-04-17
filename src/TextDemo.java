import java.util.Arrays;

public class TextDemo {

    public static boolean isSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
             if(arr[i] > arr[i + 1]) {
                 return false;
             }
        }
        return true;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            boolean flg = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flg = false;
                }
            }
            if(flg) {
                break;
            }
        }
    }
    public static int binarySearch(int[]arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int m = (left + right) / 2;
            if(arr[m] < n)
                left = m + 1;
            else if(arr[m] > n)
                right = m - 1;
            else
                return m;
        }
        return -1;
    }
    public static int[] myCopyOf(int[] arr) {
        int[] ret = new int[arr.length];
        for (int x:arr) {
            ret[x] = arr[x];
        }
        return ret;
    }
    public static String myToString(int[] arr) {
        String x = "[";
        for (int a:arr) {
            if(a != arr[arr.length - 1])
                x += a + ",";
            else
                x += a;
        }
        x += "]";
        return x;
    }

    public static void main(String[] args) {

//        int[] array = {1,2,3,4,5,6,7,8,9,0};
//        System.out.println(myToString(array));
//        System.out.println(Arrays.toString(myCopyOf(array)));


//        String x = Arrays.toString(Arrays.copyOf(array,array.length));
//        System.out.println(x);


//        System.out.println(Arrays.binarySearch(array, 5));

//        System.out.println(binarySearch(array, 5));
//        System.out.println(isSort(array));
//        bubbleSort(array);
//        System.out.println(Arrays.toString(array));
//        Person per = new Person();
//        per.setAge(21);
//        per.setName("lc");
//        int age = per.getAge();
//        String name = per.getName();
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(per);

//        Doo t1 = new Doo();
//        t1.a++;// 1
//        Doo.count++;// 1
//        System.out.println(t1.a);
//        System.out.println(Doo.count);
//        System.out.println("----------");
//        Doo t2 = new Doo();
//        t2.a++;// 1
//        Doo.count++;
//        System.out.println(t2.a);
//        System.out.println(Doo.count);
//        Person per = new Person();
//        int a = per.age;
//        String b = per.name;
//        String c = per.sex;
//        per.eat();
//        per.sleep();
//        System.out.println(per.sex);
//        System.out.println(per.age);
    }

}
