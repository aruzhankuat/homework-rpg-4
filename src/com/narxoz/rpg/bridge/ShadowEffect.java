package com.narxoz.rpg.bridge;

public class ShadowEffect implements EffectImplementor {
    public void apply(String name, int power) {
        System.out.println("Shadow effect from " + name + " power: " + power);
    }
    public double getMultiplier() { return 1.3; }
}