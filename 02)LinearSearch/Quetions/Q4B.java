package Quetions;

public class Q4B {
    static int max(int[][] arr){
        int maximum=Integer.MIN_VALUE;
        for (int[] ints:arr){
            for (int value:ints){
                if(value>maximum){
                    maximum=value;
                }
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[][] arr={
                {2,3,4},
                {18,12,3,9},
                {78, 99, 34, 56},
                {18,12}
        };
        System.out.println("The maximum Element in the given 2-D Array is "+max(arr));
    }
}
