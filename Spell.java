
public class Spell{

    private int dmg;
    private String dmgType;
    private int manaReq;
    
    /**
     * 
     * @param damage
     * @param damageType
     * @param manaRequirement
     */
    public Spell(int damage, String damageType, int manaRequirement){
        dmg = damage;
        dmgType = damageType;
        manaReq = manaRequirement;

    }

    // to do: mage/ mana class
    public int cast(Character caster, Character victim){

        return 0;

    }

    public int getDmg(){
        return dmg;
    }

    public String getDmgType(){
        return dmgType;
    }

    public int getManaReq(){
        return manaReq;
    }









}