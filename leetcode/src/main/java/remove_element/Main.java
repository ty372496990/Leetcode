package remove_element;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        String s = "123";
        Main main = new Main();
        System.out.println(main.removeElement(nums, 3));
    }
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
