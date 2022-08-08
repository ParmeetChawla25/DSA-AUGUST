package Questions;
import java.util.Arrays;
public class Q2 {
    static int maxelement(int []arr,int n){
        int max=arr[0];
        for (int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        System.out.println(Arrays.toString(arr));
        System.out.println("The maximum element is the array given above is " + maxelement(arr,arr.length));
    }
}
