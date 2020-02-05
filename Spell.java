public abstract class Spell{

    private int dmg;
    private String dmgType;
    private int manaReq;
    protected static String SPELL_TYPE;
    
   
    public Spell(int damage, String damageType, int manaRequirement){
        dmg = damage;
        dmgType = damageType;
        manaReq = manaRequirement;

    }

    public abstract int cast(Character caster, Character victim);

    public void setDmg(int wantDmg){
        this.dmg = wantDmg;
    }

    public int getDmg(){
        return dmg;
    }

    public void setDmgType(String wantSet){
        this.dmgType = wantSet;
    }

    public String getDmgType(){
        return dmgType;
    }

    public void setManaReq(int wanMana){
        this.manaReq = wanMana;
    }


    public int getManaReq(){
        return manaReq;
    }

    public String toString(){
        return String.format("Spell type: %s| Damage: %d| Damage Type: %s| Mana Requirements: %d|", SPELL_TYPE, dmg, dmgType, manaReq);


    }


}