package combination_sum;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private static List<List<Integer>> resultList = new LinkedList<>();
    private static LinkedList<Integer> tempList = new LinkedList<>();
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        Main main = new Main();
        List<List<Integer>> lists = main.combinationSum(nums, 7);
        lists.forEach(s -> s.forEach(System.out::print));
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = 0; i < candidates.length; i++) {
            if (target == 0)
                return resultList;
            if (target >= candidates[i]) {
                tempList.addLast(candidates[i]);
                resultList = combinationSum(candidates,target - candidates[i]);
            } else {
                tempList.pollLast();
                return resultList;
            }
        }
        return resultList;
    }
}
