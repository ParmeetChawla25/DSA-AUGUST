package Quetions;
import java.util.Arrays;

public class Q4A {
    static int[] search(int[][] arr,int key){
        for (int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col] == key){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr={
                {2,3,4},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int key=34;
        int[] ans=search(arr,key);
        System.out.println(Arrays.toString(ans));
    }
}
