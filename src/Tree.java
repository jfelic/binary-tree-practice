public class Tree {
    private Node root; // the only data field in Tree. Defaults to null


    // FIND //
    public Node find(int key) {
        Node current = root; // current to hold current Node

        while(current.iData != key) { //while current is not key
            if(key < current.iData) //if current is less than key, go left
                current = current.leftChild;
            else
                current = current.rightChild; //else, go right
            if(current == null)
                return null; //not found
        }
        return current;// found
    } // end of find()


    // INSERT //
    public void insert(int id, double dd) {//id = key dd = fData
        Node newNode = new Node(id, dd); //create new node with given data

        if(root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;

            while(true){
                parent = current;

                if(newNode.iData < current.iData) {
                    current = current.leftChild;
                    if (current == null){
                        parent.leftChild = newNode;
                        return;//exits
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return; //exits
                    }
                }
            }
        }
    }// end of insert()

    public void insertNodePractice(int id, double fData) {
        Node newNode = new Node(id, fData); //create new node to insert

        if(root == null) 
            root = newNode;
        else {      
            Node current = root;
            Node previous;

            while(true) {
                previous = current;

                if(id < current.iData){
                    current = current.leftChild;
                    if(current == null){
                        previous.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        previous.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    // DELETE //
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while(current.iData != key) {
            parent = current;

            if(key < current.iData) { //go left
                isLeftChild = true;
                current = current.leftChild;
            } else { //go right
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null) {
                return false; //not found
            }

            //If found and has no children
            if(current.leftChild == null && current.rightChild ==null) {
                if(current == root) 
                    root = null;
                else if(isLeftChild) 
                    parent.leftChild = null;
                else
                    parent.rightChild = null;
            }
        }
    }//end of delete()

    // FIND MAX //
    public Node findMax(){
        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    } //end of findMax()

    // FIND MIN //
    public Node findMin() {
        Node current, last;
        current = root;
        last = null;

        while(current != null) {
            last = current;
            current = current.leftChild;
        }

        return last;
    }
} //end of findMin()
