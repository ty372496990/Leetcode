import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        palindrome_number number = new palindrome_number();
//        System.out.println(number.getInteger(in.nextInt()));
        System.out.println(number.reverse(in.nextLine()));
    }

    public boolean getInteger(int a) {
        String string = Integer.toString(a);
        String string1 = new StringBuilder(string).reverse().toString();
        if(string.equals(string1)){
            return true;
        }
        else {
            return false;
        }
    }

    public String reverse(String input) {
        if(input == null || input.equals(""))
            return input;
        return reverse(input.substring(1)) + input.charAt(0);
    }
}


