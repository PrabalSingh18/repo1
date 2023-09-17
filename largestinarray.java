import static java.lang.Integer.*;

public class largestinarray {

    public static int largestno(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for (int i = 1; i <number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
             if (number[i]<smallest){
                 smallest=number[i];

            }
        }
        System.out.println("smallest value is"+smallest);
        return largest;


    }

    public static void main(String[] args) {
        int number[]={3,5,7,8,78,8709,4,54,3,46,4,8,57,43,4,39,78,90,6};
        int largestno = largestno(number);
        System.out.println("largest no in the given array is :"+largestno);
    }

    }

