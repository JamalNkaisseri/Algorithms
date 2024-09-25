public class Tree {

    private Node root;

    public Node find(int key){

        //Start at the root
        Node current = root;

        //Continue until match is found or end of tree
        while (current.iData != key){

            if(key < current.iData){
                //Move to the left child
                current = current.leftChild;
            }else {

                //Move to the right child
                current = current.rightChild;
            }

            //End of tree
            if (current == null){
                return null;
            }
        }
        return current;
    }

    public void insert(int id,double dd){

        //Create new node
        Node newNode = new Node();

        //Insert data
        newNode.iData = id;
        newNode.dData = dd;

        //No node in root
        if(root == null){
            root = newNode;
        }else {

            //Root occupied

            //Start at root
            Node current = root;
            Node parent;

            //Exits internally
            while (true){
                parent = current;

                if(id < current.iData){
                    //Go left
                    current = current.leftChild;

                    //If end of the line
                    if(current == null){

                        //Insert on the left
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    //Go right
                    current = current.rightChild;

                    //If end of the line
                    if(current == null){

                        //Insert on the right
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int key){

        //Code to delete a node with no children

        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        //Search for node
        while(current.iData != key){

            parent = current;

            //go left?
            if(key < current.iData){
                isLeftChild = true;
                current = current.leftChild;
            }

            //go right?
            else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null){
                return false;
            }
        }

        if(current.leftChild == null && current.rightChild == null){

            //If root
            if(current == root){
                root = null; //tree becomes empty
            } else if (isLeftChild) {
                parent.leftChild = null;
            }else {
                parent.rightChild = null;
            }
        }

        //Node to be deleted has one child

    }
}
