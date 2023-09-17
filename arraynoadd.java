public class arraynoadd {
    public static void update(int marks[]){
        for(int i=0; i< marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int no[]={3,5,6,8,9};
        update(no);
        for(int i=0;i< no.length;i++){
            System.out.println(no[i]);

            System.out.println(no.length);
        }

    }
}
