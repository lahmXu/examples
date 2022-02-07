package com.lahmxu.fsm.eg1;

import java.text.MessageFormat;

public class ApprovePassAction implements Action {

    @Override
    public boolean action(Context context) {

        System.out.println(MessageFormat.format("审批人{0}审批了价格，审批结果为通过", context.getParam()));
        //TODO 将审批状态更新为已审核通过
        return true;
    }
}
