package com.company.strategyPattern.simUduck.solution;

import com.company.strategyPattern.simUduck.solution.impl.FlyNoWay;
import com.company.strategyPattern.simUduck.solution.impl.MuteQuack;

public class MiniSim {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.makeSound();
        mallard.swim();
        mallard.display();


        System.out.println("-----------");
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.fly();
        mallard.makeSound();
        mallard.swim();
        mallard.display();

    }
}
