public class BinaryTree {
  int data; // 根节点的数据
  BinaryTree left; // 左子树
  BinaryTree right; //右子树
  
  // 实例化二叉树
  public BinaryTree(int data) {
    this.data = data;
    left = null;
    right = null;
  }

  // 向二叉树插入子节点1
  // 左节点比根节点小，右节点比根节点大
  public void insert(BinaryTree root, int data){
    if(data > root.data) {
      if(root.right == null) {
        root.right = new BinaryTree(data);
      } else  {
        this.insert(root.right,data);
      }
     } 


     if(data <= root.data) {
      if(root.left == null) {
        root.left = new BinaryTree(data);
      } else  {
        this.insert(root.left,data);
      }
     } 


  }
}
