public class Bow extends Weapon {

    public Bow(int damage, String damageType, double critical) {
        super(damage, damageType , 15);
        WEAPON_TYPE = "Piercing Bow";
    }

    // public static void main(String[] args) {
    //     Weapon b = new Bow(15, "Arrow", 20);
    //     System.out.println(b);
    // }

    @Override
    public int attack(Character theOtherPerson) {
        int damage;
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