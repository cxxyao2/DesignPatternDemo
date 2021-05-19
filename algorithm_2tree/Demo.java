public class Demo {
  public static void main(String[] args) {
    int[] array={12,76,35,22,16,48,90,46,9,40};
    BinaryTree root = new BinaryTree(array[0]);
    for(int i=1;i<array.length;i++) {
      root.insert(root,array[i]);
    }
    // 先根
    // 12-9-76-35-22-16-48-46-40-90-
    System.out.println("first root: ");
    BinaryTreePreorder.preOrder(root);
    System.out.println();


    // 中根
    // 9–12–16–22–35–40–46–48–76–90–
    System.out.println("in root: ");
    BinaryTreePreorder.inOrder(root);
    System.out.println();

    // 后根
    // 9—16—22—40—46—48—35—90—76—12—
    System.out.println("post root: ");
    BinaryTreePreorder.postOrder(root);
    System.out.println();


  }

}
