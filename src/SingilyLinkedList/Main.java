package SingilyLinkedList;

public class Main {
    public static void main(String[] args) {
        SingilyLinkedListS<Integer> list=new SingilyLinkedListS<Integer>();
        list.addFirst(10);
        list.addFirst(60);
        list.addFirst(30);
        list.removeFirst();
        list.display();


    }
}
