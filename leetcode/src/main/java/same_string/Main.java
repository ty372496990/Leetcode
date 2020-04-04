package same_string;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        System.out.println(main.getString(s1[0],s1[1]));

    }
    public boolean getString(String a,String b) {
        if(a.length() != b.length())
            return false;
        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        String string = String.valueOf(chars);
        String string1 = String.valueOf(chars1);
        if(string.equals(string1))
            return true;
        else {
            return false;
        }
    }
}
