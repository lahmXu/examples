package com.lahmxu.fsm.eg1;

import java.text.MessageFormat;

public class ApproveRefusedAction implements Action {
    @Override
    public boolean action(Context context) {
        System.out.println(MessageFormat.format("审批人{0}审批了价格，审批结果为拒绝", context.getParam()));
        //TODO 将审批状态更新为审核拒绝
        return true;
    }
}

