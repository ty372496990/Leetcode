package is_anagram;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(main.isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 && t.length() == 0)
            return true;
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return String.valueOf(chars).equals(String.valueOf(chars1));
    }
}
