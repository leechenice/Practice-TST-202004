public class TextDemo {
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int add(int n) {
        if(n == 1) {
            return 1;
        }
        return n + add(n - 1);
    }
    public static void print(int n) {
        if(n > 9) {
             print(n / 10);
        }
        System.out.println(n % 10);
    }
    public static int sumNum(int n) {
        if(n > 9) {
            return n % 10 + sumNum(n / 10);
        }else {
            return n;
        }

    }
    public static int fibonacci(int n) {
        if(n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);


    }
    public static int frogJump(int n) {
        if (n <= 2) {
            return n;
        }
        return frogJump(n - 1) + frogJump(n - 2);//青蛙跳台阶1 - 2
    }
    public static long frogJumpN(int n) {
        if(n == 0) {
            return 0;
        }
        return (long)Math.pow(2,frogJumpN(n - 1));//青蛙跳台阶 1 - n
    }

    public static void main(String[] args) {
        System.out.println(frogJumpN(50));
//        System.out.println(frogJump(30));
//        System.out.println(factorial(3));
//        System.out.println(add(10));
//        print(123);
//        System.out.println(sumNum(555));
//        System.out.println(fibonacci(2));


    }

}
