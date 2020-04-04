package max_subarray;

public class Main {
    public static void main(String[] args) {
        int[] n = {-2,-3,-1};
        Main main = new Main();
        System.out.println(main.maxSubArray(n));
    }

    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if(length == 1)
            return nums[0];
        if(length == 2)
            return Math.max(nums[0],Math.max(nums[1],nums[0] + nums[1]));
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = nums[i];
            max = Math.max(max,dp[i][i]);
        }
        for (int len = 1; len <= length; len++) {
            for (int start = 0; start < length; start++) {
                int end = start + len - 1;
                if(end >= length)
                    break;
                if(start == end) {
                    if(dp[start][end] > max)
                        max = dp[start][end];
                    break;
                }
                dp[start][end] = Math.max(dp[start+1][end] + nums[start],dp[start][end-1] + nums[end]);
                if(dp[start][end] > max)
                    max = dp[start][end];
            }
        }
        return max;
    }
}
