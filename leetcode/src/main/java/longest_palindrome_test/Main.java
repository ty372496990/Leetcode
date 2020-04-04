package longest_palindrome_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(main.longestPalindrome(s));
        }
    }
    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] P = new boolean[length][length];
        int maxLen = 0;
        String maxStr = "";
        for (int len = 1; len <= length; len++) {
            for (int start = 0; start < length; start++) {
                int end = start + len - 1;
                if (end >= length)
                    break;
                P[start][end] = (len == 1 || len == 2 || P[start + 1][end - 1]) && s.charAt(start) == s.charAt(end);
                if (len > maxLen && P[start][end]) {
                    maxStr = s.substring(start, end + 1);
                    maxLen = maxStr.length();
                }
            }
        }
        return maxStr;
    }
}
