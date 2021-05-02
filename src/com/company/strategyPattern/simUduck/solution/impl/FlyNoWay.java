package com.company.strategyPattern.simUduck.solution.impl;

import com.company.strategyPattern.simUduck.solution.interfaceCode.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not Fly in any possible way");
    }
}
