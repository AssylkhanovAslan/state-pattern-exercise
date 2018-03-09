package com.example.examplestatemachine;

import static com.example.examplestatemachine.StateContext.STATE_A;
import static com.example.examplestatemachine.StateContext.STATE_B;

/**
 * Created by Assylkhanov Aslan on 09.03.2018.03.2018=
 */

public class RejectState extends State {

    private StateContext theContext;

    public RejectState(StateContext context) {
        this.theContext = context;
    }

    @Override
    public void actionA() {
        super.actionA();
        if (theContext.getFirstState().equals(STATE_A)) {
            System.out.println(" Reject --> Accept ");
            theContext.setState(theContext.getAcceptState());
        } else {
            System.out.println(" I'm in reject state");
        }

    }

    @Override
    public void actionB() {
        super.actionB();
        if (theContext.getFirstState().equals(STATE_B)) {
            System.out.println(" Reject --> Accept ");
            theContext.setState(theContext.getAcceptState());
        } else {
            System.out.println(" I'm in reject state");
        }
    }
}
