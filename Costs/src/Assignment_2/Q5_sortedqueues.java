package Assignment_2;
import java.util.LinkedList;
import java.util.Queue;
public class Q5_sortedqueues {

    // Question 5: Merge two sorted queues
    public class MergeSortedQueues {

        public static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {
            Queue<Integer> result = new LinkedList<>();

            while (!q1.isEmpty() && !q2.isEmpty()) {
                if (q1.peek() <= q2.peek()) {
                    result.add(q1.remove());
                } else {
                    result.add(q2.remove());
                }
            }

            while (!q1.isEmpty()) result.add(q1.remove());
            while (!q2.isEmpty()) result.add(q2.remove());

            return result;
        }

        public static void main(String[] args) {
            Queue<Integer> q1 = new LinkedList<>();
            Queue<Integer> q2 = new LinkedList<>();

            q1.add(1); q1.add(3); q1.add(5);
            q2.add(2); q2.add(4); q2.add(6);

            System.out.println(mergeQueues(q1, q2));
        }
    }
}
