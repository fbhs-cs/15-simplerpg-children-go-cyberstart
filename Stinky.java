public class Stinky extends Spell{

    public Stinky(int damage, String damageType, int manaReq){
        super(damage, "Braincell  Killer", 60 );
        SPELL_TYPE = "Killer Stink";
    }


    public int cast(Character caster, Character victim){
        int CurMana = caster.getMana();
        if(caster.getMana() >= getManaReq()){
            if(victim.isWeakTo(SPELL_TYPE)){
                int dmg = getDmg();
                dmg *=1.5;
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