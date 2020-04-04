package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //-4 -1 -1 0 1 2
        Main main = new Main();
        main.threeSum(nums).stream().forEach(System.out::println);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) return result;
        Arrays.parallelSort(nums);
        for (int i = 0; i < nums.length ; i++) {
            int target = -nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1; // left pointer
            int k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j ++; k --;
                    while (j < nums.length && nums[j] == nums[j - 1]) j ++;
                    while (k > j && nums[k] == nums[k + 1]) k --;
                } else if (nums[j] + nums[k] > target) {
                    k --;
                } else {
                    j ++;
                }
            }
        }
        return result;
    }
}
