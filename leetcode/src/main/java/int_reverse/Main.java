package int_reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int i = in.nextInt();
            System.out.println(reverse(i));
        }
    }
    public static int reverse(int x) {
        int temp = 0;
        if(x < 0) {
            temp = x;
            x = Math.abs(x);
        }
        String s = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reverse = stringBuilder.reverse();
        int i;
        try {
            i = Integer.parseInt(reverse.toString());
        } catch (NumberFormatException e){
            i = 0;
        }
        if(temp < 0) {
            i = -i;
        }
        return i;
    }
}
