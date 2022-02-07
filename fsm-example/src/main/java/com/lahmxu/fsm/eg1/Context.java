package com.lahmxu.fsm.eg1;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Context {

    private String param;

    public Context(String param) {
        this.param = param;
    }
}
