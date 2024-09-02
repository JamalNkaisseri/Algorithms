public class Main {
    public static void main(String[] args) {

    LinkList theList = new LinkList();

        theList.insertFirst(10,10.99);
        theList.insertFirst(20,20.99);
        theList.insertFirst(30,30.99);
        theList.insertFirst(40,40.99);


        theList.displayList();

      Link f = theList.find(50);

      if(f == null){
          System.out.println("Item does not exist");
      }else{
          System.out.println("Found " + f.iData);
      }



    }
}
