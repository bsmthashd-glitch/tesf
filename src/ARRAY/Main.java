package ARRAY;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrayss arr = new Arrayss();
       int []numbers={1,9,3,4,5,6,7,8};
       Arrays.sort(numbers);
      // int[] numbers =new int[5];
       // arr.input(numbers);
       // arr.Traversal(numbers);
       // arr.update(numbers,2, 0);
      //  arr.delete(numbers,5);
       //arr.shiftLeft_delete(numbers,2);
        arr.shiftright_delete(numbers,2);

//int result =arr.linearSearch(numbers,7);
        int result =arr.BinarySearch(numbers,8,0,numbers.length-1);
       if(result!=-1)
    System.out.println("value found at index"+result);
else
    System.out.println("value ont found");
    }
}
