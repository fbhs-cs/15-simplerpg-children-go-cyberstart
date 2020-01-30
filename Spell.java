
public class Spell{

    private int dmg;
    private String dmgType;
    private int manaReq;
    private String SPELL_TYPE;
    
   
    public Spell(int damage, String damageType, int manaRequirement){
        dmg = damage;
        dmgType = damageType;
        manaReq = manaRequirement;

    }

    /**
     * casts a spell on another Character and returns the damage on the victim
     * @param caster the Character
     * @param victim
     * @return
     */
    public int cast(Character caster, Character victim){
        if(caster.getMana() >= manaReq){
            victim.takeDamage(dmg);
            caster.mana -= (.5*dmg);
        }


        return dmg;

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

    public String toString(){
        return String.format("Spell type: %s| Damage: %d| Damage Type: %s| Mana Requirements: %d|");


    }











}