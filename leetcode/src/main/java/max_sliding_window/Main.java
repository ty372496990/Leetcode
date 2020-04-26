package max_sliding_window;

import java.util.PriorityQueue;

public class Main {
    private static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(11,(l1,l2) -> l2 - l1);
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1,3,1,2,0,5};
        int[] ints = main.maxSlidingWindow(nums, 3);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int[] result = new int[nums.length - k + 1];
        int low = 0;
        int high = k - 1;
        while (high < nums.length) {
            if (priorityQueue.size() != 0) {
                priorityQueue.remove(nums[low - 1]);
                priorityQueue.offer(nums[high]);
            } else {
                for (int i = low;i <= high;i ++) {
                    priorityQueue.offer(nums[i]);
                }
            }
            result[low] = priorityQueue.peek();
            low ++;
            high ++;
        }
        return result;
    }
}
