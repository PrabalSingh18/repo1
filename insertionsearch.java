public class insertionsearch { 
    public static void insertionarr(int arr[]){
        for(int i=1;i<=arr.length;i++){
            int temp=i;
            int j=i-1;
            while(j<=0 && arr[j]>arr[temp]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;


        }
    }
    public static void main(String[] args) {
        int []arr={45,7,3,27};
        insertionarr(arr);

    }
}
