package com.narxoz.rpg.bridge;
import com.narxoz.rpg.composite.CombatNode;

public class SingleTargetSkill extends Skill {
    public SingleTargetSkill(String name, int mana, EffectImplementor imp) {
        super(name, mana, imp);
    }

    @Override
    public void use(CombatNode target) {
        int damage = (int) (150 * implementor.getMultiplier());
        System.out.println("Using SingleTargetSkill: " + skillName + " on " + target.getName());
        implementor.apply(skillName, damage);
        target.takeDamage(damage);
    }
}