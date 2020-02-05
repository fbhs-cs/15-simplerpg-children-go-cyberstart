public class Ice extends Spell {
    public Ice(int damage, String damageType, int manaRequirement) {
        super(damage,damageType,manaRequirement);
        SPELL_TYPE = "Ice";
    }
        
    @Override
    public int cast(Character caster, Character victim){
        int CurMana = caster.getMana();
        if(caster.getMana() >= getManaReq()){
            if(victim.isWeakTo(SPELL_TYPE)){
                setDmg((int)(getDmg()*1.5));
                victim.takeDamage((int)(getDmg()));
                caster.setMana(CurMana-getManaReq());
            }
            else{
                victim.takeDamage(getDmg());
                caster.setMana(CurMana-getManaReq());
            }
        }

        return getDmg();

    }

}