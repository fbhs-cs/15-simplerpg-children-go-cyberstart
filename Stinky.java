public class Stinky extends Spell{
    
    public Stinky(int damage, )


    public int cast(Character caster, Character victim){
        int CurMana = caster.getMana();
        if(caster.getMana() >= manaReq){
            if(victim.isWeakTo(SPELL_TYPE)){
                dmg *=1.5;
                victim.takeDamage((int)(dmg));
                caster.setMana(CurMana-manaReq);
            }
            else{
                victim.takeDamage(dmg);
                caster.setMana(CurMana-manaReq);
            }
        }


        return dmg;

    }
}