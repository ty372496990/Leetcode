package longest_common_prefix;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String[] strings = {"dog","racecar","car"};
        System.out.println(main.longestCommonPrefix(strings));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(str) != 0) {
                str = str.substring(0,str.length()-1);
                if (str.isEmpty()) return "";
            }
        }
        return str;
    }
}
