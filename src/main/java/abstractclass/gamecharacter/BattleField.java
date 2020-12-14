package abstractclass.gamecharacter;

public class BattleField {
    private int round;

    public BattleField() {
    }

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender){
        if (attacker.isAlive() && defender.isAlive()){
            attacker.secondaryAttack(defender);
            attacker.primaryAttack(defender);
        }
        return attacker.isAlive() && defender.isAlive();
    }

    public Character fight(Character one, Character other){
        while (oneHit(one, other) && oneHit(other, one)){
           round++;
        }
        return one.isAlive() ? one : other;
    }


}
