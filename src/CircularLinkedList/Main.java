package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularyLinkedList<String> list=new  CircularyLinkedList<>();
        {
            list.addlast("Alaa");
            list.addlast("Shahd");
            list.addlast("Maryam");
            list.addFirst("Ghofran");
            list.addlast("Basma");
            list.addFirst("Amat");
            list.addlast("Jehad");
            list.addlast("Tasneem");
            list.removeFirst();
            list.removeLast();
            list.removeFirst();
            list.display();






        }
    }

}