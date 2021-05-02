package com.company.strategyPattern.simUduck.solution.impl;

import com.company.strategyPattern.simUduck.solution.interfaceCode.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
