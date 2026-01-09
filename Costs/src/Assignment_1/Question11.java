package Assignment_1;

class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyListOperations {
    public void printReverse(DNode tail) {
        if (tail == null) {
            System.out.println("القائمة فارغة!");
            return;
        }

        DNode temp = tail;
        System.out.print("القائمة بالعكس: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

// كلاس المين للتشغيل
public class Question11 {
    public static void main(String[] args) {
        DNode n1 = new DNode(100);
        DNode n2 = new DNode(200);
        DNode n3 = new DNode(300);

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        DoublyListOperations operations = new DoublyListOperations();

        operations.printReverse(n3);
    }
}
