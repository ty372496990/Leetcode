package combination_sum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        Main main = new Main();
        List<List<Integer>> lists = main.combinationSum2(nums, 8);
        lists.forEach(System.out::println);
    }
    List<List<Integer>> ans = new ArrayList<>() ;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0) return ans ;
        Arrays.sort(candidates) ;
        helper(candidates,target,0,0,new ArrayList<>()) ;
        return ans ;
    }
    public void helper(int[] candidates,int target,int sum,int index,List<Integer> temp){
        if(sum == target){
            ans.add(new ArrayList<>(temp)) ;
            return ;
        }else{
            for(int i = index ; i < candidates.length ; i++){
                if(i > index && candidates[i] == candidates[i-1]) continue ; //continue的原因在于当前数和上一个数字大小相同，那么上个数字出现的符合预期的所有结果会包含这个数字出现的结果里。
                if(sum + candidates[i] <= target){
                    temp.add(candidates[i]) ;
                    helper(candidates,target,sum+candidates[i],i+1,temp) ;
                    temp.remove(temp.size()-1) ;
                }
            }
        }
    }
}
