public class Main {
    public static void main(String[] args) {

    SortedList theList = new SortedList();

        theList.insert(20);
        theList.insert(10);
        theList.insert(560);
        theList.insert(1);
        theList.insert(45);
        theList.insert(18);

        theList.displayList();

        theList.remove();
        theList.remove();

        theList.displayList();

        theList.insert(7);
        theList.insert(33);
        theList.insert(78);

        theList.displayList();



    }
}
