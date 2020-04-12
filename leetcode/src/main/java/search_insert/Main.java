package search_insert;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1,3,5,6};
        System.out.println(main.searchInsert2(nums, 0));
    }
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                return i;
            if (target > nums[i])
                continue;
            if (target < nums[i])
                return i;
        }
        return nums.length;
    }
    public int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) >>> 1;
            if (target == nums[middle]) {
                return middle;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
