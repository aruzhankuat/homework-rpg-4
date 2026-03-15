package com.narxoz.rpg.bridge;

public class FireEffect implements EffectImplementor {
    public void apply(String name, int power) {
        System.out.println("Fire effect from " + name + " power: " + power);
    }
    public double getMultiplier() { return 1.5; }
}