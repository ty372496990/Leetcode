package permute_unique;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {3,3,0,3};
        main.permuteUnique(nums).forEach(System.out::println);
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(res, temp, nums,used);
        return res;
    }
    private void dfs(List<List<Integer>> res , LinkedList<Integer> temp, int[] nums,boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (int start = 0; start < nums.length; start++) {
            if (used[start]) continue;
            if (start > 0 && nums[start] == nums[start - 1] && !used[start - 1]) continue;
                temp.addLast(nums[start]);
                used[start] = true;
                dfs(res, temp, nums,used);
                temp.removeLast();
                used[start] = false;
        }
    }
}
