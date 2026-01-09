package Assignment_1;

class CircularSearcher {
    public int search(Node head, int target) {
        if (head == null) return -1;

        Node temp = head;
        int position = 1;

        do {
            if (temp.data == target) {
                return position;
            }
            temp = temp.next;
            position++;
        } while (temp != head);

        return -1;
    }
}

// كلاس المين للتشغيل
public class Question15 {
    public static void main(String[] args) {
        CircularSearcher searcher = new CircularSearcher();

        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);
        head.next.next.next = head;

        int target = 21;
        int result = searcher.search(head, target);

        System.out.println("--- البحث في القائمة الدائرية ---");
        if (result != -1) {
            System.out.println("العنصر " + target + " موجود في الموقع: " + result);
        } else {
            System.out.println("العنصر غير موجود.");
        }
    }
}
