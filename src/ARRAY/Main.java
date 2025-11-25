package ARRAY;

public class Main {
    public static void main(String[] args) {
        Arrayss arr = new Arrayss();



        //int []numbers={1,2,3,4,5};
        int[] numbers ={1,2,3,4,5};
        arr.Traversal(numbers);
        arr.update(numbers, 9, 4);
        arr.Traversal(numbers);
        //arr.ReversalTraversal(number);
    }
}
