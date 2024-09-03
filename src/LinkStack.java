public class LinkStack {

    private final DoubleEndedList theList;

    public LinkStack(){
        theList = new DoubleEndedList();
    }

    public void push(int j){
        theList.insertFirst(j);
    }

    public int pop(){
        return theList.deleteFirst();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void displayStack(){
        System.out.print("Stack(Top --> Bottom): ");
        theList.displayList();
    }
}
