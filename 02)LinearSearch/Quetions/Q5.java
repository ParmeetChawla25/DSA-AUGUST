package Quetions;

public class Q5 {
    static int digitCount(int n){
        if(n<0){
            n = n*(-1);
        }
        int count = 0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    static int evenDigits(int[] arr){
        int ans=0;
        for (int i=0;i<arr.length;i++){
            if(digitCount(arr[i])%2==0){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println("The Number of elements in the given array with even index is "+evenDigits(nums));
    }
}
