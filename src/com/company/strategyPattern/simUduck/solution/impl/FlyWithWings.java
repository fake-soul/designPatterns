package com.company.strategyPattern.simUduck.solution.impl;

import com.company.strategyPattern.simUduck.solution.interfaceCode.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
