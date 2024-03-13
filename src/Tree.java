public class Tree {
    private Node root; // the only data field in Tree. Defaults to null


    // FIND //
    public Node find(int key) {
        Node current = root; // create new Node to hold current Node

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

    public void delete(int key) {

    }

    // FIND MIN //
    public Node minimum() {
        Node current, last;
        current = root;
        last = null;

        while (current != null) {
            last = current; //remember node
            current = current.leftChild;
        }
        return last;
    } //end of min()

    // FIND MAX //
    public Node maximum() {
        Node current, last;
        current = root;
        last = null;

        while(current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    } //end of maximum()
}
