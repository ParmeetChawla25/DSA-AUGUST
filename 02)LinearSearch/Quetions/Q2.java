package Quetions;

public class Q2 {
    static int searchInARange(int[] arr,int key,int begin,int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i=begin;i<=end;i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {18,12,-7,3,14,20};
        int key=3;
        int begin=2;
        int end=arr.length-2;
        if (searchInARange(arr,key,begin,end) == -1){
            System.out.println("The given element is not present in the given range.");
        }
        else{
            System.out.println("The given element is present at the index "+searchInARange(arr,key,begin,end));
        }
    }
}
