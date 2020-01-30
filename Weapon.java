public class Weapon {

    private int dmg;
    private String dmgType;
    private double crit;
    private String WEAPON_TYPE;

    /**
     * Weapon constructor that sets dmg to damage and gives the weapon name
     * @param damage max amount of base damage
     * @param name name of the weapon type
     * @param critical Percent chance of hitting a critical hit
     */
    public Weapon(int damage, String name, double critical) 
    {
        dmg = damage;
        dmgType = name;
        crit = critical;
    }

    /**
     * Attack method that takes in that Character that is getting attacked
     * @param theOtherPerson the character recieving the attack
     * @return the integer amount of damage
     */
    public int attack(Character theOtherPerson) 
    {
        int damage = 0;
        int minDmg = dmg/2;
        int maxDmg = dmg;

        damage = (int)(minDmg + (((maxDmg - minDmg) + 1)* Math.random())); // calculates damage anywhere between minDmg and maxDmg

        if (Math.random() <= crit) // chance to hit a critical
        {
            System.out.println("Critical Hit!");
            if (theOtherPerson.weakness.equals(dmgType)) return (int)((damage*2) * 1.5); // check if the character is weak to it and increase damage by 50%
            else {
                return (damage*2); 
            }
        }
        else {
            if (theOtherPerson.weakness.equals(dmgType)) return (int)(damage * 1.5);
            else {
                return damage;
            }
        }
    }

    /**
     * gets weapon type
     * @return weapon type name
     */
    public String getWeaponType() 
    {
        return WEAPON_TYPE;
    }

    /**
     * gets damage type
     * @return damage type name
     */
    public String getDmgType() 
    {
        return dmgType;
    }

    /**
     * gets max base damage
     * @return max base damage
     */
    public int getDmg()
    {
        return dmg;
    }

    /**
     * get critical hit chance
     * @return
     */
    public double getCrit()
    {
        return crit;
    }

    
    /** 
     * Returns formatted string
     * @return Formatted string that contains class info
     */
    public String toString()
    {
        return String.format("Weapon: %s | Damage: %d | Damage Type: %s | Critical Chance: %f ", WEAPON_TYPE, dmg, dmgType, crit);
    }
  
}