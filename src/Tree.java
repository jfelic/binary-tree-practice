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

    // Slightly different find method //
    public Node findNode(int key) {//Assuming non-empty tree
        Node current = root;

        while(current != null) {
            if (current.iData == key)
                break; // Found
            else if (current.iData > key)
                current = current.leftChild;
            else
                current = current.rightChild;

            if (current == null)
                return null; // Not found
        }
        return current; //found
    }//end of findNode()


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

    public void insertNode(int key, double fData) {
        Node newNode = new Node(key, fData);

        if(root == null) //if empty tree
            root = newNode;
        else {
            Node current = root;
            Node last;

            while (true) {
                last = current;

                if (current.iData > key) {
                    current = current.leftChild;

                    if (current == null) {
                        last.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;

                    if (current == null) {
                        last.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int key) { //delete not with given key
        Node current, last;          //(assumes non-empty list)
        current = root;
        last = root;
        boolean isLeftChild = true;

        while(current.iData != key) {
            last = current;
            if(current.iData > key) { //go left?
                isLeftChild = true;
                current = current.leftChild;
            } else { //or go right?
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null)
                return false; //didn't find it
        } //end while
    }

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
