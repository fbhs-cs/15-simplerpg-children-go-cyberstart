public abstract class Weapon {

    private int dmg;
    private String dmgType;
    private double crit;
    protected static String WEAPON_TYPE;

    /**
     * Weapon constructor that sets dmg to damage and gives the weapon name
     * @param damage max amount of base damage
     * @param name name of the weapon type
     * @param critical Percent chance of hitting a critical hit
     */
    public Weapon(int damage, String name, double critical) 
    {
        this.dmg = damage;
        this.dmgType = name;
        this.crit = critical;
    }

    /**
     * Attack method that takes in that Character that is getting attacked
     * @param theOtherPerson the character recieving the attack
     * @return the integer amount of damage
     */
    public abstract int attack(Character theOtherPerson);

    /**
     * gets weapon type
     * @return weapon type name
     */
    public String getWeaponType() 
    {
        return WEAPON_TYPE;
    }

    /**
     * sets weapon type
     * @param name weapon type
     */
    public void setWeaponType(String name) 
    {
        WEAPON_TYPE = name;
    }

    /**
     * gets damage type
     * @return damage type name
     */
    public String getDmgType() 
    {
        return this.dmgType;
    }

    /** 
     * sets damage type
     * @param name name of damage type
     */
    public void setDmgType(String name) 
    {
        this.dmgType = name;
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
     * sets damage
     * @param dam damage value
     */
    public void setDmg(int dam)
    {
        this.dmg = dam;
    }

    /**
     * get critical hit chance
     * @return crit chance
     */
    public double getCrit()
    {
        return crit;
    }
  
    /** 
     * sets critical hit chance percentage
     * @param perc critical hit chance
     */
    public void setCrit(double perc)
    {
        this.crit = perc;
    }

    /** 
     * Returns formatted string
     * @return Formatted string that contains class info
     */
    public String toString()
    {
        return String.format("Weapon: %s | Damage: %d | Damage Type: %s | Critical Chance: %f ", WEAPON_TYPE, this.dmg, this.dmgType, this.crit);
    }
}