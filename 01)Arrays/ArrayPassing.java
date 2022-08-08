import java.util.Arrays;
public class ArrayPassing {
    static void change(int []arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
}
