public class Skeleton extends Character{
    private Weapon PoisonSword;

    public Skeleton(int xp, String weakTo, String name, int howFast){
        super(xp, weakTo, name, howFast);
        
    }

    @Override 
    public void chooseAction(Character player){
        int dmg = PoisonSword.attack(player);
        System.out.printf("%s was attacked by %s and lost %d hp, and now has %d hp.", player.getName(), this.getName(), dmg, player.getHp()) ;

    }

}