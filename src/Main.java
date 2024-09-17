public class Main {
    public static void main(String[] args) {

       DynamicArray array;

       array = new DynamicArray(100);

        array.insert(64);
        array.insert(21);
        array.insert(33);
        array.insert(70);
        array.insert(12);
        array.insert(85);
        array.insert(44);
        array.insert(3);
        array.insert(99);
        array.insert(0);
        array.insert(108);
        array.insert(36);
        array.insert(7);
        array.insert(134);
        array.insert(47);

        array.display();

        array.mergeSort();

        array.display();






    }
}
