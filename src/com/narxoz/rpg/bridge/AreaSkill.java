package com.narxoz.rpg.bridge;
import com.narxoz.rpg.composite.CombatNode;

public class AreaSkill extends Skill {
    public AreaSkill(String name, int mana, EffectImplementor imp) {
        super(name, mana, imp);
    }

    @Override
    public void use(CombatNode target) {
        int damage = (int) (100 * implementor.getMultiplier());
        System.out.println("Using AreaSkill: " + skillName);
        implementor.apply(skillName, damage);
        target.takeDamage(damage);
    }
}