package CircularLinkedList;

public class CircularyLinkedList<E> {
    private Node<E> tail;
    private int size;

    public CircularyLinkedList() {
        tail=null;
        size=0;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public void addFirst(E data){
        if(isEmpty()){
            Node<E> newNode=new Node(data,null);
            tail=newNode;
            newNode.setNext(tail);
        }
        else {
            Node<E> newNode=new Node(data,tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }
    public void addlast(E data){
        addFirst(data);
        tail=tail.getNext();
    }
    public E getFirst(){
        if (isEmpty())return null;
        return tail.getNext().getData();
    }
    public E getLast(){
        if (isEmpty())return null;
        return tail.getData();
    }



    class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }
    }



}
