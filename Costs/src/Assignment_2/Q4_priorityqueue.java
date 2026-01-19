package Assignment_2;
import java.util.PriorityQueue;

public class Q4_priorityqueue {

    // Question 4: Priority Queue implementation
    public class PriorityQueueImpl {

        public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            pq.add(30);
            pq.add(10);
            pq.add(20);

            while (!pq.isEmpty()) {
                System.out.println(pq.poll());
            }
        }
    }
}
