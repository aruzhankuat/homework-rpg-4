package com.narxoz.rpg.bridge;
import com.narxoz.rpg.composite.CombatNode;

public abstract class Skill {
    protected EffectImplementor implementor;
    protected String skillName;
    protected int manaCost;

    public Skill(String name, int mana, EffectImplementor imp) {
        this.skillName = name;
        this.manaCost = mana;
        this.implementor = imp;
    }

    public abstract void use(CombatNode target);
}