public class Main {
    public static void main(String[] args) {

        DoubleEndedList firstLast = new DoubleEndedList();

        firstLast.insertFirst(10);
        firstLast.insertFirst(20);
        firstLast.insertFirst(30);

        firstLast.insertLast(40);
        firstLast.insertLast(50);
        firstLast.insertLast(60);

        firstLast.displayList();


    }
}
