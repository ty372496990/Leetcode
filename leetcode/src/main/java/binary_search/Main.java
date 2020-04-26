package binary_search;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int i = binarySearch(nums, 6);
        System.out.println(i);
    }
    private static int binarySearch(int[] a,int target) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (target > a[mid]) {
                low = mid + 1;
            } else if (target == a[mid]) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
