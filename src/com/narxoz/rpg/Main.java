import com.narxoz.rpg.battle.*;
import com.narxoz.rpg.bridge.*;
import com.narxoz.rpg.composite.*;

public class Main {
    public static void main(String[] args) {
        CombatNode hero1 = new HeroUnit("Warrior", 200, 50, 10);
        CombatNode hero2 = new HeroUnit("Mage", 100, 200, 5);

        RaidGroup party = new PartyComposite("Alpha Team");
        party.addMember(hero1);
        party.addMember(hero2);

        EffectImplementor fire = new FireEffect();
        Skill fireball = new AreaSkill("Fireball", 40, fire);

        RaidEngine engine = new RaidEngine();
        RaidResult result = engine.runBattle(fireball, party);

        party.displayStatus("");
        result.printInfo();
    }
}