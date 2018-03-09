package com.example.examplestatemachine;


/**
 * Created by Assylkhanov Aslan on 09.03.2018.03.2018=
 */

public class StateContext {

    public final static String STATE_A = "A";
    public final static String STATE_B = "B";

    State acceptState;
    State rejectState;
    State state;
    String firstState;

    public StateContext() {
        this.acceptState = new AcceptState(this);
        this.rejectState = new RejectState(this);
        state = rejectState;
        firstState = null;
    }

    public void actionA() {
        if (firstState == null) {
            firstState = STATE_A;
        }
        state.actionA();
    }

    public void actionB() {
        if (firstState == null) {
            firstState = STATE_B;
        }
        state.actionB();
    }

    public boolean isAccept() {
        return state.isAccept();
    }

    public State getAcceptState() {
        return acceptState;
    }

    public void setAcceptState(State acceptState) {
        this.acceptState = acceptState;
    }

    public State getRejectState() {
        return rejectState;
    }

    public void setRejectState(State rejectState) {
        this.rejectState = rejectState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getFirstState() {
        return firstState;
    }

    public void setFirstState(String firstState) {
        this.firstState = firstState;
    }
}
