public class Goblin extends Character{
    private Weapon PoisonSword;

    public Goblin(int xp , String weakTo, String name, int speed) {
        super(xp, weakTo, name, speed);
        
    }
    public void chooseAction(Character target){
        PoisonSword.attack(target);
    }







}