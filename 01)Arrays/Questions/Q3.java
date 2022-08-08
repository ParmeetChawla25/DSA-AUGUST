package Questions;
import java.util.Arrays;
public class Q3 {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        System.out.println("Arrays before reversing");
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length/2;i++) {
            swap(arr, i, arr.length - 1 - i);
        }
        System.out.println("Arrays after reversing");
        System.out.println(Arrays.toString(arr));
    }
}
