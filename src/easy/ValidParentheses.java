package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by tairovich_jr on 2021-04-22.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {


        System.out.println(isValid("()[]{}"));

    }

}
