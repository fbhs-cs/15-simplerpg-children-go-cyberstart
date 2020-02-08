public class Goblin extends Character{
    private Weapon poisonSword;

    public Goblin(int xp , String weakTo, String name, int speed) {
        super(xp, weakTo, name, speed);
        poisonSword = new PoisonSword(25, "Poison", 10);
    }

    @Override
    public void chooseAction(Character target){
        int dam = poisonSword.attack(target);
        System.out.println(this.getName() + "(" + this.getHp() + ")" + 
                            " attacked " + target.getName() + "(" + target.getHp() + ")"
                             + " with " + poisonSword.getWeaponType() + " for " + dam + " damage");
    }







}