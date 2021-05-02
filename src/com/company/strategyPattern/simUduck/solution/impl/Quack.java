package com.company.strategyPattern.simUduck.solution.impl;

import com.company.strategyPattern.simUduck.solution.interfaceCode.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack...");
    }
}
