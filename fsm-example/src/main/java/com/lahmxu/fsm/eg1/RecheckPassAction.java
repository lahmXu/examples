package com.lahmxu.fsm.eg1;

import java.text.MessageFormat;

public class RecheckPassAction implements Action {
    @Override
    public boolean action(Context context) {
        System.out.println(MessageFormat.format("审批人{0}对未审核通过的价格进行复核，审批结果为通过", context.getParam()));
        //TODO 将审批状态更新为审核通过
        return true;
    }
}
