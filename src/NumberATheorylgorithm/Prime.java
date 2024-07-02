package NumberATheorylgorithm;

public class Prime {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        boolean res = isPrime(num1, num2);
        System.out.println(res);
    }
    private static boolean isPrime(int num1, int num2) {
        return gcd(num1, num2) == 1;
    }
    private static int gcd(int num1, int num2){
//        while (num2 != 0){
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//        }
//        return num1;
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }
}
