package util;

public class BehaviorTree {
  private Node root;

  public BehaviorTree(Node root) {
    this.root = root;
  }

  public void tick() {
    root.tick();
  }

  public boolean haveRoot() {
    return root != null ? true : false;
  }

  public void setRoot(Node inNode) {
    root = inNode;
  }

}