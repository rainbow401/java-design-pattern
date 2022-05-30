package com.finitestatemachine.mario.other;

import com.finitestatemachine.MarioStateMachine;
import com.finitestatemachine.State;
import com.finitestatemachine.mario.IMario;

public class SuperMario implements IMario {

    private static final SuperMario instance = new SuperMario();

    private SuperMario() {}

    public static SuperMario getInstance() {
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