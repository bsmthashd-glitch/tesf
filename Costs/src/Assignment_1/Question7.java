package Assignment_1;

// كلاس يحتوي على وظيفة البحث
class ListSearcher {
    public int search(Node head, int target) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == target) {
                return position;
            }
            temp = temp.next;
            position++;
        }

        return -1;
    }
}

// كلاس المين للتشغيل
public class Question7 {
    public static void main(String[] args) {
        ListSearcher searcher = new ListSearcher();

        Node head = new Node(10);
        head.next = new Node(25);
        head.next.next = new Node(40);
        head.next.next.next = new Node(55);

        int targetValue = 40;
        int result = searcher.search(head, targetValue);

        System.out.println("--- نتيجة البحث عن الرقم " + targetValue + " ---");
        if (result != -1) {
            System.out.println("تم العثور على العنصر في الموقع رقم: " + result);
        } else {
            System.out.println("العنصر غير موجود في القائمة.");
        }
    }
}
