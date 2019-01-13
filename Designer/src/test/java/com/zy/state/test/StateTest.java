package com.zy.state.test;

import structure.com.zy.state.IState;
import structure.com.zy.state.StateContext;

/**
 * created by Freeze on 2019/1/13
 **/
public class StateTest {

    public static void main(String [] args){
        IState state = null;
        for(int i=1;i<4;i++){
            try {
                StateContext context = new StateContext();
                context.setIstate(i);
                state = context.getIstate();
                state.printState();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
