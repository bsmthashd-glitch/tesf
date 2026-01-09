package Assignment_1;

// تعريف العقدة (Node) للقائمة المرتبطة
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListLinker {
    public Node concatenate(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node temp = list1;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = list2;

        return list1;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// كلاس المين للتشغيل
public class Question5 {
    public static void main(String[] args) {
        ListLinker linker = new ListLinker();

        Node l1 = new Node(10);
        l1.next = new Node(20);

        Node l2 = new Node(30);
        l2.next = new Node(40);

        System.out.println("القائمة الأولى قبل الربط:");
        linker.printList(l1);

        Node result = linker.concatenate(l1, l2);

        System.out.println("القائمة بعد ربط القائمة الثانية بها:");
        linker.printList(result);
    }
}
