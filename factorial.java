public class factorial {
    public static int facto(int n){
        int a=1;
        for (int i=1;i<=n;i++){
            a=a*i;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(facto(4));
    }
}
