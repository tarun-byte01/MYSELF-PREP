import java.util.ArrayList;
class main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int max = arr[0];
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
         System.out.println("max num "+max);
    }
}
