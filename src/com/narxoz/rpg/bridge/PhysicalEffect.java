package com.narxoz.rpg.bridge;

public class PhysicalEffect implements EffectImplementor {
    public void apply(String name, int power) {
        System.out.println("Physical effect from " + name + " power: " + power);
    }
    public double getMultiplier() { return 1.0; }
}