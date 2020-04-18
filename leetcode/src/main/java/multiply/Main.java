package multiply;

public class Main {
    public static void main(String[] args) {
        String num1 = "123";
        String num3 = "456";
        Main main = new Main();
        System.out.println(main.multiply(num1, num3));
    }
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int length1 = num1.length();
        int length2 = num2.length();
        int[] res = new int[length1 + length2];
        for (int i = length1 - 1; i >= 0; i --) {
            int n1 = num1.charAt(i) - '0';
            for (int j = length2 - 1; j >= 0; j --) {
                int n2 = num2.charAt(j) - '0';
                int sum = res[i + j + 1] + n1 * n2;
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (i == 0 && res[i] == 0) continue;
            stringBuilder.append(res[i]);
        }
        return stringBuilder.toString();
    }
}
