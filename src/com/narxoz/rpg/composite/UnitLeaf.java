package com.narxoz.rpg.composite;

public class UnitLeaf implements CombatNode {
    protected String name;
    protected String type;
    protected Stats stats;

    public UnitLeaf(String name, String type, int hp, int mana, int def) {
        this.name = name;
        this.type = type;
        this.stats = new Stats(hp, mana, def, 1);
    }

    @Override
    public void takeDamage(int amount) {
        int resultDamage = amount - stats.defense;
        if (resultDamage < 0) resultDamage = 0;
        stats.hp -= resultDamage;
        if (stats.hp < 0) stats.hp = 0;
        System.out.println(name + " received " + resultDamage + " damage. Current HP: " + stats.hp);
    }

    @Override
    public void displayStatus(String indent) {
        System.out.println(indent + "Unit: " + name + " (" + type + ") HP: " + stats.hp);
    }

    @Override
    public boolean isAlive() { return stats.hp > 0; }

    @Override
    public String getName() { return name; }
}