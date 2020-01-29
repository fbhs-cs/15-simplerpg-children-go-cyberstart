public class Weapon {

    private int dmg;
    private String dmgType;
    private double crit;
    private String WEAPON_TYPE;

    /**
     * Weapon constructor that sets dmg to damage and gives the weapon name
     * @param damage max amount of base damage
     * @param name name of the weapon
     */
    public Weapon(int damage, String name, double critical) 
    {
        dmg = damage;
        dmgType = name;
        crit = cricital;
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

        damage = 1 + (minDmg + (Math.random() * minDmg));

        boolean[] bool = new boolean[10];

        // for (int i = 0; i < bool.length; i++) 
        // {
        //     bool[i] = 
        // }

        if (Math.random() >= 0.5) return (damage*2);
        else {
            return damage;
        }
    }

    /**
     * weapon type getter
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

    public int getDmg()
    {
        return dmg;
    }

    public double getCrit()
    {
        return crit;
    }
  
}