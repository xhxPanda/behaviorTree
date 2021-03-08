package util.impl;

import command.ResultCode;
import util.AbstractNode;

public class BaseComposite extends AbstractNode {

    @Override
    public int addChildIndex(AbstractNode node) {
        return 0;
    }

    @Override
    public int getChildrenNum() {
        return 0;
    }

    @Override
    public boolean isSuccess(AbstractNode parent) {
        return false;
    }

    @Override
    public ResultCode tick() {
        return null;
    }

    @Override
    public void onInitialize() {

    }

    @Override
    public ResultCode action() {
        return null;
    }
}
