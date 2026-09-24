  import java.util.ArrayList;
class Solution {
    public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
        int target = 3;
        ArrayList<Integer> list = new ArrayList<>();
       
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]==target){
                System.out.println("found: "+ i);
            }
        }
        
    }
}
