public class LinearSearch {
    static int linearSearch(int[] arr,int n,int key){
        if(arr.length == 0){
            return -1;
        }
        for (int index=0;index<n;index++){
            if(arr[index] == key){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int key=77;
        if (linearSearch(arr,arr.length,key) == -1){
            System.out.println("The given element is not found in the array");
        }
        else{
            System.out.println("The given element is found at the index "+linearSearch(arr,arr.length,key));
        }
    }
}
