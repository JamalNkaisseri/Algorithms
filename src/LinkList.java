public class LinkList {

    //Reference to first link

    private Link first;

    public LinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id,double dd){

        //Create new node
        Link newLink = new Link(id,dd);

        //Set the next field of new node to point to old first node
        newLink.next = first;

        //Set first to point to new node
        first = newLink;
    }

    public Link deleteFirst(){

        //Store reference to first link
        Link temp = first;

        //Set first to point to 2nd node in the list
        first = first.next;

        return temp;
    }

    public void displayList(){

        System.out.print("List (first --> last):");

        //Set current to point to first node
        Link current = first;

        while(current != null){
            current.displayLink();//Print data
            current = current.next;//Move to next link
        }
        System.out.println(" ");
    }

    public Link find(int key){

        //Start at first link
        Link current = first;

        //Loop until item is found
        while(current.iData != key){

            //End of list
            if(current.next == null){
                return null;
            }else {
                //Move to next node
                current = current.next;
            }
        }
        //Found it
        return current;
    }

    public Link delete(int key){

        //Start at first node
        Link current = first;
        Link previous = first;

        //Loop until item is found
        while (current.iData != key){

            //End of list
            if (current.next == null){
                return null;
            }else {

                //Move to next node
                previous = current;
                current = current.next;
            }
        }

        //Found it
        if(current == first){

            //Set first to point to the second node
            first = first.next;
        }else {

            //Set next field of previous to point to node after current
            previous.next = current.next;
        }
        return current;
    }
}
