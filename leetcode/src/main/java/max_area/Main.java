package max_area;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        Main main = new Main();
        int i = main.maxArea(a);
        System.out.println(i);
    }
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while(i < j){
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }
}
