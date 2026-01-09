package Assignment_1;


class ArrayOperations {
    private int[] arr;
    private int size;

    public ArrayOperations(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int element) {
        if (size < arr.length) {
            arr[size] = element;
            size++;
        } else {
            System.out.println("المصفوفة ممتلئة");
        }
    }

    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("الموقع غير صحيح");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// الكلاس الأساسي للتشغيل
public class Question1 {
    public static void main(String[] args) {
        ArrayOperations myArr = new ArrayOperations(5);

        myArr.insert(10);
        myArr.insert(20);
        myArr.insert(30);
        myArr.insert(40);

        System.out.print("المصفوفة قبل الحذف: ");
        myArr.display();

        myArr.deleteAt(1);

        System.out.print("المصفوفة بعد حذف الموقع 1: ");
        myArr.display();
    }
}