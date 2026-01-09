package Assignment_1;

class ListDeleter {
    public Node deleteAtPosition(Node head, int position) {
        if (head == null) return null;

        if (position == 1) {
            return head.next;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("الموقع المدخل غير موجود!");
            return head;
        }


        temp.next = temp.next.next;

        return head;
    }

    public void display(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
}

// كلاس المين للتشغيل
public class Question9 {
    public static void main(String[] args) {
        ListDeleter deleter = new ListDeleter();

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("القائمة قبل الحذف: ");
        deleter.display(head);

        head = deleter.deleteAtPosition(head, 3);

        System.out.print("القائمة بعد حذف الموقع 3: ");
        deleter.display(head);
    }
}
