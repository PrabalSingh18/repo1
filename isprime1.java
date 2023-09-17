public class isprime1 {
    public static boolean isPrime(int n) {
        boolean isprime = true;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;

            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

}
