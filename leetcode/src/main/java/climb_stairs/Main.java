package climb_stairs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main main = new Main();
        while (in.hasNext()) {
            int i = in.nextInt();
            System.out.println(main.climbStairs(i));
        }
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n == 1 || n == 2)
            return n;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < dp.length; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
