package search_range;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        Main main = new Main();
        int[] ints = main.searchRange(nums, 8);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = (left + right) >>> 1;
            if (nums[middle] >= target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        if (left == nums.length || target != nums[left]) return new int[]{-1, -1};
        int resultLeft = left;
        left = 0;
        right = nums.length;
        while (left < right) {
            int middle = (left + right) >>> 1;
            if (nums[middle] > target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return new int[]{resultLeft, left - 1};
    }
}
