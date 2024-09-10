public class DoublyLinkedList {

    private DoubleLink first;
    private DoubleLink last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int key){

        DoubleLink newLink = new DoubleLink(key);

        if(isEmpty()){
            last = newLink;
        }else {

            first.previous = newLink;
        }

        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int key){

        DoubleLink newLink = new DoubleLink(key);

        if(isEmpty()){
            first = newLink;
        }else {
            last.next = newLink;
            newLink.previous = last;
        }

        last = newLink;
    }

    public DoubleLink deleteFirst(){

        DoubleLink temp = first;

        if(first.next == null){
            last = null;
        }else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public DoubleLink deleteLast(){
        DoubleLink temp = last;

        if(first.next == null){
            first = null;
        }else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key,int item){

        //Assumes non empty list

        //Start at the beginning
        DoubleLink current = first;

        while (current.iData != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }

        DoubleLink newLink = new DoubleLink(item);

        //If at the last link
        if(current == last){
            newLink.next = null;
            last = newLink;
        }else{
            //Not the last link
            newLink.next = current.next;
            current.next.previous = newLink;
        }

        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public DoubleLink deleteKey(int key){

        //Start at the beginning
        DoubleLink current = first;

        while (current.iData != key){

            //Move to the next
            current = current.next;

            //Did not find it
            if(current == null){
                return null;
            }
        }

        //If it is the first item
        if(current == first){
            first = current.next;
        }else{
            current.previous.next = current.next;
        }

        if(current == last){
            last = current.previous;
        }else {
            current.next.previous = current.next;
        }
        return current;
    }

    public void displayForward(){
        System.out.print("List(First --> Last) :");

        DoubleLink current = first;

        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void displayBackward(){
        System.out.print("List (Last --> First) :");

        DoubleLink current = last;

        while(current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println(" ");
    }
}
