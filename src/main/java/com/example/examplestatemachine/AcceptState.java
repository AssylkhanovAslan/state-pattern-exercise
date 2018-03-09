package com.example.examplestatemachine;

import static com.example.examplestatemachine.StateContext.STATE_A;
import static com.example.examplestatemachine.StateContext.STATE_B;

/**
 * Created by Assylkhanov Aslan on 09.03.2018.03.2018=
 */

public class AcceptState extends State {

    StateContext theContext;

    public AcceptState(StateContext context) {
        this.theContext = context;
        this.accept = true;
    }


    @Override
    public void actionA() {
        super.actionA();
        if (theContext.getFirstState().equals(STATE_A)) {
            System.out.println(" I'm in accept state");
        } else {
            System.out.println(" Accept --> Reject ");
            theContext.setState(theContext.getRejectState());
        }
    }

    @Override
    public void actionB() {
        super.actionB();
        if (theContext.getFirstState().equals(STATE_B)) {
            System.out.println(" I'm in accept state");
        } else {
            System.out.println(" Accept --> Reject ");
            theContext.setState(theContext.getRejectState());
        }
    }
}
