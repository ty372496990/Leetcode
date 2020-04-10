package search_array;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3};
        Main main = new Main();
        System.out.println(main.search(nums, 0));
    }
    public int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) >>> 1;
            if (target == nums[middle]) {
                return middle;
            } else if (nums[middle] < nums[end]) {
                if (nums[middle] < target && target <= nums[end])
                    start = middle + 1;
                else
                    end = middle - 1;
            } else {
                if (nums[start] <= target && target < nums[middle])
                    end = middle - 1;
                else
                    start = middle + 1;
            }
        }
        return -1;
    }
}
