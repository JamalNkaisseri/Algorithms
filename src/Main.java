public class Main {
    public static void main(String[] args) {

    DoublyLinkedList theList = new DoublyLinkedList();

        theList.insertFirst(30);
        theList.insertFirst(20);
        theList.insertFirst(10);

        theList.displayForward();

        theList.deleteKey(20);

        theList.displayForward();

        theList.insertLast(40);
        theList.insertLast(50);
        theList.insertLast(60);

        theList.displayForward();

        theList.insertAfter(10,20);

        theList.displayForward();




    }
}
