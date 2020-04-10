package next_permutation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Main main = new Main();
        main.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 1)
            return;
        int i = nums.length - 1;
        while (i > 0) {
            if (nums[i - 1] < nums[i]) {
                int min = nums[i];
                int minIndex = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < min && nums[j] > nums[i -1]) {
                        min = nums[j];
                        minIndex = j;
                    }
                }
                int tmp = nums[minIndex];
                nums[minIndex] = nums[i - 1];
                nums[i - 1] = tmp;
                Arrays.parallelSort(nums,i,nums.length);
                break;
            }
            i --;
        }
        if (i == 0)
            Arrays.parallelSort(nums);
    }
}
