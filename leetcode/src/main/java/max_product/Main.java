package max_product;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,-1,1,1};
        Main main = new Main();
        System.out.println(main.maxProduct(nums));
    }
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] maxDP = new int[n];
        int[] minDP = new int[n];
        maxDP[0] = nums[0];
        minDP[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < n; i++) {
            maxDP[i] = Math.max(maxDP[i - 1] * nums[i],Math.max(minDP[i - 1] * nums[i],nums[i]));
            minDP[i] = Math.min(maxDP[i - 1] * nums[i],Math.min(minDP[i - 1] * nums[i],nums[i]));
            res = Math.max(maxDP[i],res);
        }
        return res;
    }
}
