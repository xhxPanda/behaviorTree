package util;

import java.util.concurrent.Executor;

public class BehaviorTree {
  private AbstractNode root;

  private Executor executor;

  public void tick() {
    root.tick();
  }

  public boolean haveRoot() {
    return root != null ? true : false;
  }

  public void setRoot(AbstractNode inNode) {
    root = inNode;
  }
}