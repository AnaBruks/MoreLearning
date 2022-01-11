package BiTree;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public int getValue() {
        return this.value;
    }
    public void setValue(final int value) {
        this.value = value;
    }
    public Node getLeftChild() {
        return this.leftChild;
    }
    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }
    public Node getRightChild() {
        return this.rightChild;
    }
    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }
    public Node(int value) { // constructor
        this.value = value;
    }

    @Override
    public String toString() {
        return "BiTree.Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}

