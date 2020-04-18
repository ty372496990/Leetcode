package count_and_say;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.countAndSay(4));
    }
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        StringBuilder stringBuilder = new StringBuilder();
        int start = 0;
        int cur = 1;

        String s = countAndSay(n - 1);
        while (cur < s.length()) {
            if (s.charAt(start) != s.charAt(cur)) {
                int count = cur - start;
                stringBuilder.append(count).append(s.charAt(start));
                start = cur;
            }
            cur ++;
        }
        if (cur != start) {
            int count = cur - start;
            stringBuilder.append(count).append(s.charAt(start));
        }
        return stringBuilder.toString();
    }
}
