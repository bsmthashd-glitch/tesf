package Assignment_2;
import java.util.Stack;

public class Q1_usingstack {


    // Question 1: Reverse a string using Stack
    public static class ReverseStringStack {

        public static String reverseString(String input) {
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            return reversed.toString();
        }

        public static void main(String[] args) {
            System.out.println(reverseString("DataStructure"));

        }
    }
}
