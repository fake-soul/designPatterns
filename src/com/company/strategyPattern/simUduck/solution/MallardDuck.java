package com.company.strategyPattern.simUduck.solution;

import com.company.strategyPattern.simUduck.solution.impl.FlyWithWings;
import com.company.strategyPattern.simUduck.solution.impl.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(" I am MallardDuck..");
    }
}
