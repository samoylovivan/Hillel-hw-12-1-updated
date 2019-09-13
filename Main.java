package ivan.samoylov;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("cat man dog mouse bird fish"));
    }

    public static String reverse(String s) {
        StringBuilder tmp = new StringBuilder("");
        Stack<StringBuilder> stack = new Stack<>();

        for (char ch: s.toCharArray()) {
            if(Character.isAlphabetic(ch)){
                tmp.append(ch);
            }
            else {
                stack.push(new StringBuilder(tmp));
                tmp.delete(0, tmp.length());
            }
        }
        stack.push(new StringBuilder(tmp));
        tmp.delete(0, tmp.length());
        while (!stack.isEmpty()){
            tmp.append(stack.pop()).append(" ");
        }
        return tmp.toString().trim();
    }
}