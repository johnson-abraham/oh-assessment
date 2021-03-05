package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tree.Tree;
import tree.TreeNode;

class TrinaryTree {

  @Test
  @DisplayName("Tests insertion of trinary tree")
  void testInsert() {
    final Tree<Integer> tree = new Tree<>();
    tree.insert(5);
    tree.insert(4);
    tree.insert(9);
    tree.insert(5);
    tree.insert(7);
    tree.insert(10);
    tree.insert(2);
    tree.insert(2);

    final TreeNode<Integer> root = tree.getRoot();

    assertAll(
        () -> assertEquals(5, root.getData()),
        () -> assertEquals(5, root.getMiddleNode().getData()),
        () -> assertEquals(4, root.getLeftNode().getData()),
        () -> assertEquals(9, root.getRightNode().getData()),
        () -> assertEquals(2, root.getLeftNode().getLeftNode().getData()),
        () -> assertEquals(2, root.getLeftNode().getLeftNode().getMiddleNode().getData()),
        () -> assertEquals(7, root.getRightNode().getLeftNode().getData()),
        () -> assertEquals(10, root.getRightNode().getRightNode().getData()));
  }
}
