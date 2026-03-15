package com.narxoz.rpg.composite;

public class HeroUnit extends UnitLeaf {
    public HeroUnit(String name, int hp, int mana, int def) {
        super(name, "Hero", hp, mana, def);
    }
}