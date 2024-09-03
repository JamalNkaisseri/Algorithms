public class LinkQueue {

    private DoubleEndedList theList;

    public LinkQueue(){

        //Create a new double ended queue
        theList = new DoubleEndedList();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void insert(int j){

        //Items in a queue are inserted at the rear
        theList.insertLast(j);
    }

    public int delete(){

        //Items in a queue are removed from the front
        return theList.deleteFirst();
    }

    public void displayQueue(){
        theList.displayList();
    }
}
