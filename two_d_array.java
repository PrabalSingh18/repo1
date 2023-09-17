import java.util.Scanner;

public class two_d_array {
    public static boolean toodarr(int array[][],int key){
        int m= array.length;
        int n=array[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(array[i][j]==key){
                    System.out.println("key found in the array at index"+i+" "+j);
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]=new int[2][2];
        int m= matrix.length;
        int n=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        //input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
         }
        //output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            }
        toodarr(matrix,5);
}
}
