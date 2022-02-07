package com.lahmxu.fsm.eg1;

public class Test {

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.transform(State.APPROVE, Event.APPROVE_REFUSED, new Context("lahmxu"));
    }
}
