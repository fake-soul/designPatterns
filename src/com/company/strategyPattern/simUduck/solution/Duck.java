package com.company.strategyPattern.simUduck.solution;

import com.company.strategyPattern.simUduck.solution.interfaceCode.FlyBehavior;
import com.company.strategyPattern.simUduck.solution.interfaceCode.QuackBehavior;

public class Duck {
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void swim() {
        System.out.println("I am swimming");
    }
    public void display() {
        System.out.println("I am looking great");
    }
    public void makeSound() { quackBehavior.quack(); }
    public void fly() { flyBehavior.fly(); }


}
