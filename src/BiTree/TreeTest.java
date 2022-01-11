package BiTree;

public class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node rootNode = new Node(20);
        tree.insertNode(10);
        tree.insertNode(2);
        tree.insertNode(15);

        System.out.println(tree.findNodeByValue(10));
        tree.printTree();

    }
}
