package Quetions;

public class Q6 {
    static int maxWealth(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] row:arr){
            int count = 0;
            for (int column:row){
                count = count + column;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] wealth={
                {1,2,3},
                {3,2,1}
        };
        System.out.println("The maximum wealth is "+maxWealth(wealth));
    }
}
