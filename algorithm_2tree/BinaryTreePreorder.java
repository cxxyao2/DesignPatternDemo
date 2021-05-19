// 遍历二叉树1
public class BinaryTreePreorder {
    //先根遍历
public static void preOrder(BinaryTree root){
  if(root != null) {
    System.out.println(root.data+ "-");
    preOrder(root.left);
    preOrder(root.right);
  }
}

  // 中根遍历
  public static void inOrder(BinaryTree root) {
    if(root != null) {
      inOrder(root.left);
      System.out.println(root.data+ "-");
      inOrder(root.right);
    }
  }


  // 后根遍历
  public static void postOrder(BinaryTree root) {
  if(root != null) {
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.data+ "-");
    }
  }


}
