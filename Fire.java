


public class Fire extends Spell{
    public Fire(){
        super(20,"Fire",5);
        SPELL_TYPE = "Fire Cantrip";
    }
    @Override
    public int cast(Character caster, Character victim){
        int curMana = caster.getMana();
        int reqMana = getManaReq();
        int damage = getDmg();
        if(caster.getMana() >= reqMana){
            if(victim.isWeakTo(SPELL_TYPE)){
                damage *=1.5;
                victim.takeDamage((int)(damage));
                caster.setMana(curMana-reqMana);
            }
            else{
                victim.takeDamage(damage);
                caster.setMana(curMana-reqMana);
            }
        }


        return damage;

    }

}
        
