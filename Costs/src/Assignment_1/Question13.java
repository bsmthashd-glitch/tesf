package Assignment_1;

class CircularOperations {
    public Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        if (position == 1) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            return newNode;
        }

        Node prev = head;
        for (int i = 1; i < position - 1 && prev.next != head; i++) {
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;

        return head;
    }

    public void display(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(العودة للرأس)");
    }
}

// كلاس المين للتشغيل
public class Question13 {
    public static void main(String[] args) {
        CircularOperations circular = new CircularOperations();

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = head;

        System.out.print("القائمة الدائرية قبل الإضافة: ");
        circular.display(head);

        head = circular.insertAtPosition(head, 15, 2);

        System.out.print("القائمة بعد إضافة 15 في الموقع 2: ");
        circular.display(head);
    }
}