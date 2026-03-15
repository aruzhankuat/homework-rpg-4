package com.narxoz.rpg.composite;
import java.util.ArrayList;
import java.util.List;

public class RaidGroup implements CombatNode {
    protected String groupName;
    protected List<CombatNode> members = new ArrayList<>();

    public RaidGroup(String name) {
        this.groupName = name;
    }

    public void addMember(CombatNode node) {
        members.add(node);
    }

    @Override
    public void takeDamage(int amount) {
        int aliveCount = 0;
        for (CombatNode node : members) {
            if (node.isAlive()) aliveCount++;
        }
        if (aliveCount > 0) {
            int damagePerNode = amount / aliveCount;
            for (CombatNode node : members) {
                if (node.isAlive()) node.takeDamage(damagePerNode);
            }
        }
    }

    @Override
    public void displayStatus(String indent) {
        System.out.println(indent + "Group: " + groupName);
        for (CombatNode node : members) {
            node.displayStatus(indent + "    ");
        }
    }

    @Override
    public boolean isAlive() {
        for (CombatNode node : members) {
            if (node.isAlive()) return true;
        }
        return false;
    }

    @Override
    public String getName() { return groupName; }
}