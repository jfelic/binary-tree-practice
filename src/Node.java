public class Node {
    int iData; //key
    double fData; // other data
    Node leftChild;
    Node rightChild;

    public Node(int iData, double fData) {
        this.iData = iData;
        this.fData = fData;
        leftChild = null;
        rightChild = null;
    }

    public void displayNode() {
        System.out.println("(" + this.iData + " : " + this.fData + ")");
    }

    public int getKey() {
        return iData;
    }
}
