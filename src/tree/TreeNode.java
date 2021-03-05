package tree;

import static java.util.Objects.isNull;

public class TreeNode<T extends Comparable<T>> {

  private T data;
  private TreeNode<T> leftNode;
  private TreeNode<T> middleNode;
  private TreeNode<T> rightNode;

  public TreeNode(T data) {
    this.data = data;
  }

  public void insert(T data) {
    final int comparedValue = data.compareTo(this.data);

    if (comparedValue == 0 && isNull(middleNode)) {
      middleNode = new TreeNode<>(data);
    } else if (comparedValue < 0) {
      if (isNull(leftNode)) {
        leftNode = new TreeNode<>(data);
      } else {
        leftNode.insert(data);
      }
    } else {
      if (isNull(rightNode)) {
        rightNode = new TreeNode<>(data);
      } else {
        rightNode.insert(data);
      }
    }
  }

  public T getData() {
    return data;
  }

  public TreeNode<T> getLeftNode() {
    return leftNode;
  }

  public TreeNode<T> getMiddleNode() {
    return middleNode;
  }

  public TreeNode<T> getRightNode() {
    return rightNode;
  }
}
