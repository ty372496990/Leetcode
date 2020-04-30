package majority_element;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(main.majorityElement(nums));
    }
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int num : nums) {
           if (countMap.containsKey(num)) {
               Integer integer = countMap.get(num);
               countMap.put(num , integer + 1);
               if (integer + 1 > (nums.length >>> 1))
                   return num;
           } else {
               countMap.put(num,1);
           }
        }
        return Integer.MIN_VALUE;
    }
}
