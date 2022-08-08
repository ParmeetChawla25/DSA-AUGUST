package Quetions;

public class Q5Optimised {
    static int digits(int num){
        if(num<0){
            num=num*(-1);
        }
        return (int)(Math.log10(num))+1;
    }
    static int EvenDigits(int[]arr){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (digits(arr[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println("The Number of elements in the given array with even index is "+EvenDigits(nums));
    }
}
