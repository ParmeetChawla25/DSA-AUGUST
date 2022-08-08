package Questions;
import java.util.Arrays;

public class Q1 {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println("The Array before Swapping is:-");
        System.out.println(Arrays.toString(arr));
        System.out.println("The Array after Swapping is:-");
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
}
