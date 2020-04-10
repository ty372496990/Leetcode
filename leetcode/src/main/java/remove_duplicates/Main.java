package remove_duplicates;

public class Main {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Main main = new Main();
        System.out.println(main.removeDuplicates(nums));
    }
}
