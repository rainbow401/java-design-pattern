package com.finitestatemachine.mario.other;

import com.finitestatemachine.MarioStateMachine;
import com.finitestatemachine.State;
import com.finitestatemachine.mario.IMario;

public class FireMario implements IMario {

    private static final FireMario instance = new FireMario();

    private FireMario() {}

    public static FireMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {

    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {

    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {

    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {

    }
}