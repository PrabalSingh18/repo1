public class binarysearch {
    public static int binarysearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            if (key==mid){
                return key;

            }
            if(key>mid){
                start=mid;
        }
            if(key<mid){
                end=mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int key=5;
        binarysearch(array,key);

    }
}
