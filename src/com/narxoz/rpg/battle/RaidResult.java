package com.narxoz.rpg.battle;

public class RaidResult {
    private boolean isAlive;
    private int damage;

    public RaidResult(boolean isAlive, int damage) {
        this.isAlive = isAlive;
        this.damage = damage;
    }

    public void printInfo() {
        System.out.println("Battle completed. Success: " + isAlive + ", Damage dealt: " + damage);
    }
}