package com.lahmxu.fsm.eg1;

import lombok.Data;

@Data
public class ActionMapping {

    private State currentState;

    private State nextState;

    private Action action;

    private Event event;

    public static ActionMapping ofMap(State currentState, Event event,State nextState, Action action){
        return new ActionMapping(currentState,event,nextState,action);
    }

    private ActionMapping(State currentState, Event event,State nextState, Action action){
        this.currentState = currentState;
        this.event = event;
        this.nextState = nextState;
        this.action = action;
    }
}
