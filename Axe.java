public class Axe extends Weapon{

    public Axe(int damage, String name, double critical ){
        super(damage, "Slashing", 50);
        WEAPON_TYPE = "Slashers Axe";

    }


    @Override
    public int attack(Character theOtherPerson) {
        int damage = 0;
        int minDmg = getDmg()/2;
        int maxDmg = getDmg();

        damage = (int)(minDmg + (((maxDmg - minDmg) + 1)* Math.random())); // calculates damage anywhere between minDmg and maxDmg

        if (Math.random() <= getCrit()) // chance to hit a critical
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