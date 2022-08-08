package CyclicSortFinal;

public class Q1 {
    static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=0;
        for (int num : nums) {
            sum1 = sum1 + num;
        }
        int sum2=(n*(n+1))/2;
        return sum2-sum1;
    }

    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
}
//WE ARE NOT GOING USE THIS SOLUTION BECAUSE THIS TAKES O(N) COMPLEXITY
