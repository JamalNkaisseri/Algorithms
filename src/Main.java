public class Main {
    public static void main(String[] args) {

      Tree theTree = new Tree();

      theTree.insert(50,1.5);
      theTree.insert(25,1.7);
      theTree.insert(75,1.9);

      Node found = theTree.find(26);

      if(found != null){
        System.out.println("Found the node with the key");
      }else {
        System.out.println("Did not find the node");
      }


    }
}
