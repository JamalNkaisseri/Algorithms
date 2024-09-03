public class SortedList {

    private DoubleLink first;

    public SortedList(){

        //List is empty
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(int key){

        //Create a new link
        DoubleLink newLink = new DoubleLink(key);

        //Start at the beginning
        DoubleLink previous = null;
        DoubleLink current = first;

        while (current != null && key > current.iData){

            //Move to the next node
            previous = current;
            current = current.next;
        }

        //If at the beginning
        if(previous == null){

            //Set new link to point to the old 1st link
            //If the list is empty, first == null and the new link will point to null
            newLink.next = first;

            //Set first to point to the new link
            first = newLink;
        }else {
            //At the middle
            previous.next = newLink;
            newLink.next = current;

        }
    }

    public DoubleLink remove(){
        //Deletes and returns the first link

        DoubleLink temp = first;

        //Set the pointer to the 2nd node
        first = first.next;

        return temp;
    }

    public void displayList(){

        System.out.print("List(First --> Last): ");

        //Start at beginning of the list
        DoubleLink current = first;

        while (current != null){
            //Display the item
            current.displayLink();

            //Move to the next node
            current = current.next;

        }

        System.out.println(" ");
    }
}
