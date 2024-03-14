public class Main {
    public static void main(String[] args) {
        Tree theTree = new Tree();

        theTree.insertNode(50, 1.5);
        theTree.insertNode(100, 2.0);
        theTree.insertNode(25, 1.7);
        theTree.insertNode(75, 1.9);

        Node found = theTree.find(25);
        if(found != null)
            System.out.println("Found the node with key 25");
        else
            System.out.println("Could not find the node with key 25");

        Node max = theTree.findMax();
        max.displayNode();

        Node min = theTree.findMin();
        min.displayNode();
    }
}