package com.finitestatemachine.mario;

import com.finitestatemachine.MarioStateMachine;
import com.finitestatemachine.State;

public interface IMario {
    State getName();
    void obtainMushRoom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);
}
