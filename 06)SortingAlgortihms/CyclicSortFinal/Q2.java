package CyclicSortFinal;
import java.util.ArrayList;
import java.util.List;

public class Q2 {
    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
    static List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        List<Integer> temp = new ArrayList<>();
        for (int index=0;index<nums.length;index++){
            if (nums[index]!=index+1){
                temp.add(index+1);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> x=findDisappearedNumbers(arr);
        System.out.println(x);
    }
}
