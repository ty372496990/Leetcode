package fast_sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2,5,3,7,8};
        quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i);
        }
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int index = getIndex(arr, low, high);
            quickSort(arr, low, index-1);
            quickSort(arr, index+1, high);
        }

    }
    public static int getIndex(int[] arr,int low,int high) {
        int tmp = arr[low];
        while(low < high) {
            while (low < high && arr[high] >= tmp) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= tmp) {
                low++;
            }
            arr[high] = arr[low];
        }

        arr[low] = tmp;
        return low;
    }
}


