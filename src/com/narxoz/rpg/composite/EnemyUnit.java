package com.narxoz.rpg.composite;

public class EnemyUnit extends UnitLeaf {
    public EnemyUnit(String name, int hp, int def) {
        super(name, "Enemy", hp, 0, def);
    }
}