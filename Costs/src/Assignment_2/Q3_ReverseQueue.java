package Assignment_2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Q3_ReverseQueue {
    // Question 3: Reverse elements in a Queue
    public class ReverseQueue {

        public static void reverseQueue(Queue<Integer> queue) {
            Stack<Integer> stack = new Stack<>();

            while (!queue.isEmpty()) {
                stack.push(queue.remove());
            }

            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
        }

        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);

            reverseQueue(queue);
            System.out.println(queue);
        }
    }
}
