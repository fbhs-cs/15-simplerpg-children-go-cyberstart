public class PoisonSword extends Weapon{

    public PoisonSword(int damage, String dmgType, double critical ){
        super(damage, "Poison", 30 );
        WEAPON_TYPE = "Poisoned Sword";

    }


    @Override
    public int attack(Character theOtherPerson) {
        int damage = 0;
        int minDmg = getDmg()/2;
        int maxDmg = getDmg();

        damage = (int)(minDmg + (((maxDmg - minDmg) + 1)* Math.random())); // calculates damage anywhere between minDmg and maxDmg

        if (Math.random() <= (getCrit()/100)) // chance to hit a critical
        {
            System.out.println("Critical Hit!");
            if (theOtherPerson.isWeakTo(getDmgType())) {
                theOtherPerson.takeDamage((int)((damage*2) * 1.5));
                return (int)((damage*2) * 1.5); // check if the character is weak to it and increase damage by 50%
            }
            else {
                theOtherPerson.takeDamage(damage*2);
                return (damage*2); 
            }
        }
        else {
            if (theOtherPerson.isWeakTo(getDmgType())) {
                theOtherPerson.takeDamage((int)(damage * 1.5));
                return (int)(damage * 1.5);
            }
            else {
                theOtherPerson.takeDamage(damage);
                return damage;
            }
        }
    }

} 
    
