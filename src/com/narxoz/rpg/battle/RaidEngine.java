package com.narxoz.rpg.battle;
import com.narxoz.rpg.composite.CombatNode;
import com.narxoz.rpg.bridge.Skill;

public class RaidEngine {
    public RaidResult runBattle(Skill skill, CombatNode target) {
        System.out.println("Battle turn started.");
        skill.use(target);
        boolean success = target.isAlive();
        return new RaidResult(success, 100);
    }
}