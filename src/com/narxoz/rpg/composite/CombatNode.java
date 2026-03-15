package com.narxoz.rpg.composite;

public interface CombatNode {
    void takeDamage(int amount);
    void displayStatus(String indent);
    String getName();
    boolean isAlive();
}