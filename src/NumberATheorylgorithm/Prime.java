package NumberATheorylgorithm;

public class Prime {
    public static void main(String[] args) {
        int num = 5;
        boolean res = isPrime(num);
        System.out.println("prime:" + res);
    }
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
