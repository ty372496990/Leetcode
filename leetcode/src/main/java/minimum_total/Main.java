package minimum_total;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new LinkedList<>();
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
        LinkedList<Integer> l4 = new LinkedList<>();
        l2.add(3);l2.add(4);
        l3.add(6);l3.add(5);l3.add(7);
        l4.add(4);l4.add(1);l4.add(8);l4.add(3);
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
        triangle.add(l4);
        Main main = new Main();
        int i = main.minimumTotal(triangle);
        System.out.println(i);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[][] dp = new int[row + 1][row + 1];
        for (int i = row - 1; i >= 0; i--){
            List<Integer> curTr = triangle.get(i);
            for(int j = 0 ; j < curTr.size(); j++){
                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + curTr.get(j);
            }
        }
        return dp[0][0];
    }
}
