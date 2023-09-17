public class primesinrange {
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
    public static void primeinrange(int n){
        for(int i=1;i<=n;i++){
            if(isPrime(i)){//is true
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeinrange(88);

    }
}
