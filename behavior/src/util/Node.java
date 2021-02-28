package util;

public abstract class Node {
    private ICondition preCondition;

    public abstract void addChild(Node node);

    public abstract void tick();
}
