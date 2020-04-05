package three_sum_closest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //[-1, 2, 1, -4]
        //[-4, -1, 1, 2]
        int[] nums= {0,0,0};
        Main main = new Main();
        System.out.println(main.threeSumClosest(nums,1));
    }
    public int threeSumClosest(int[] nums, int target) {
        //非法判断
        if (nums.length <= 2) return Integer.MIN_VALUE;
        //升序排序
        Arrays.parallelSort(nums);
        //最小值
        int min = Integer.MAX_VALUE;
        //结果
        int result = 0;
        //双指针判断
        for (int i = 0; i < nums.length - 2; i++) {
            //临时目标值
            int temp = target - nums[i];
            //左指针
            int j = i + 1;
            //右指针
            int k = nums.length - 1;
            while (j < k) {
                int abs = Math.abs(nums[j] + nums[k] - temp);
                //恰好相等返回目标值
                if (abs == 0) {
                    return target;
                } else if (nums[j] + nums[k] - temp > 0) { // 如果大了就左移右指针
                    if (abs < min){
                        min = abs;
                        result = nums[i] + nums[j] + nums[k];
                    }
                    k --;
                } else { //小了就右移左指针
                    if (abs < min){
                        min = abs;
                        result = nums[i] + nums[j] + nums[k];
                    }
                    j ++;
                }
            }
        }
        return result;
    }
}
