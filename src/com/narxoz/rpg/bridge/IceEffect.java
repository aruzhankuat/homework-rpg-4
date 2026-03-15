package com.narxoz.rpg.bridge;

public class IceEffect implements EffectImplementor {
    public void apply(String name, int power) {
        System.out.println("Ice effect from " + name + " power: " + power);
    }
    public double getMultiplier() { return 1.1; }
}