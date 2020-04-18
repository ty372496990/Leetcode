package permute;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Main main = new Main();
        List<List<Integer>> permute = main.permute(nums);
        permute.forEach(System.out::println);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        dfs(res,temp,nums);
        return res;
    }
    private void dfs(List<List<Integer>> res, LinkedList<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (int num : nums) {
            if (!temp.contains(num)) {
                temp.addLast(num);
                dfs(res,temp,nums);
                temp.removeLast();
            }
        }
    }

}
