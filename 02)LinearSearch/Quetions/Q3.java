package Quetions;

public class Q3 {
    static int minElement(int[] arr){
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {18,12,-7,3,14,20};
        System.out.println("The minimum element of the given Array is "+minElement(arr));
    }
}
