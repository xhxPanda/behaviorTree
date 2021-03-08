package util;

import command.ResultCode;

public abstract class AbstractNode {
    private AbstractNode parent;

    public abstract int addChildIndex(AbstractNode node);

    /**
     * 增加子节点
     */
    public int addChild(AbstractNode node) {
        int index = addChildIndex(node);
        return index;
    }

    public abstract int getChildrenNum();

    public abstract boolean isSuccess(AbstractNode parent);

    /**
     * 每次的执行
     */
   public abstract ResultCode tick();

    /**
     * 在节点调用前
     */
    public abstract void onInitialize();

    /**
     * 具体的行动
     */
    public abstract ResultCode action();
}
