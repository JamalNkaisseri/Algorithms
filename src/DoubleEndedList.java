public class DoubleEndedList {

    private DoubleLink first;
    private DoubleLink last;

    public DoubleEndedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int item){

        //Create a new node
        DoubleLink newLink = new DoubleLink(item);

        if(isEmpty()){

            //Set last to point to newly created node
            last = newLink;
        }else {

            //Set the next field in the new node to point to the old 1st
            //Set the first field to point to the new node

            newLink.next = first;
        }
        first = newLink;
    }

    public void insertLast(int item){

        //Create a new node
        DoubleLink newLink = new DoubleLink(item);

        if(isEmpty()){

            //Set first to point to the new node
            first = newLink;
        }else{

            //Set next field of last node to point to the new node
            last.next = newLink;

        }
        //Set last to point to the new node
        last = newLink;
    }

    public int deleteFirst(){

        int temp = first.iData;

        //If there's only one item
        if(first.next == null){

            //Set last to point to nothing
            last = null;
        }else {

            //Set first to point to the second node
            first = first.next;
        }
        return temp;
    }

    public void displayList(){

        System.out.print("(First --> Last):");

        //Start at the first node
        DoubleLink current = first;

        while(current != null){

            //Print the data
            current.displayLink();

            //Move to the next node
            current = current.next;
        }
        System.out.println(" ");
    }
}
