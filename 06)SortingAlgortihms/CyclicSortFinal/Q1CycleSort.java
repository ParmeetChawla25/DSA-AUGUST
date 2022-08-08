package CyclicSortFinal;

public class Q1CycleSort {
    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
    static int missingNumber(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i];
            if (arr[i]!=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j=0;j<arr.length;j++){
            if (arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int nums[]={0,3,2,1};
        System.out.println(missingNumber(nums));
    }
}
