package ARRAY;

public class Main {
    public static void main(String[] args) {
        Arrayss arr = new Arrayss();
        //int []numbers={1,2,3,4,5};
        int[] numbers =new int[5];
        arr.input(numbers);
        arr.Traversal(numbers);
        arr.update(numbers, 9, 4);
        arr.delete(numbers,3);
        arr.shiftLeft_delete(numbers,2);

    }
}
