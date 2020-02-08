public class Skeleton extends Character{
    private Weapon poisonSword;

    public Skeleton(int xp, String weakTo, String name, int howFast){
        super(xp, weakTo, name, howFast);
        poisonSword = new PoisonSword(25, "Poison", 10);
        
    }

    @Override 
    public void chooseAction(Character player){
        int dmg = poisonSword.attack(player);
        System.out.printf("\n%s was attacked by %s and lost %d hp, and now has %d hp.", player.getName(), this.getName(), dmg, player.getHp()) ;

    }

}