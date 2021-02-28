package util;

public abstract class Node {
    private Condition preCondition;

    public abstract void addChild(Node node);

    public abstract void tick();
}
