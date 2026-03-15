package com.narxoz.rpg.composite;

public class Stats {
    public int hp;
    public int maxHp;
    public int mana;
    public int defense;
    public int level;

    public Stats(int hp, int mana, int defense, int level) {
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.defense = defense;
        this.level = level;
    }
}