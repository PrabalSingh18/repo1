public class linearsearch {//find the index of any element in a given array

    public static int linearsearch(int[] no, int key) {
        for (int i = 0; i <= no.length; i++) {
            if (no[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int no[]={2,3,4,8,06,545,54};
        int key=4;
        linearsearch(no,key);
        int index =linearsearch(no,key);
        if (key==-1){
            System.out.println("key is not found in the array");
        }
        else {
            System.out.println(index);
        }
    }
}
