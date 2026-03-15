package com.narxoz.rpg.bridge;

public interface EffectImplementor {
    void apply(String skillName, int power);
    double getMultiplier();
}