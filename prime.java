public class prime {

    public static boolean isPrime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
                break;

            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(99878));
    }

}
