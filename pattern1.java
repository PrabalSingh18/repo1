public class pattern1 {
    public static void hollowrect(int rowno,int columno) {
        for (int i = 1; i <= rowno; i++) {// here i is total rows and j is total column no
            for (int j = 1; j <= columno; j++) {
                if (i == 1 || j == 1||i==rowno||j==columno) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowrect(9,9);
    }
}
