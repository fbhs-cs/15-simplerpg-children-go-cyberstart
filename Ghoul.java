public class Ghoul extends Character {
    private Weapon axe;

    public Ghoul(int xp, String weak, String name, int howFast) {
        super(xp, weak, name, howFast);
        axe = new Axe(5, "Slashing", 10);
    }

    @Override
    public void chooseAction(Character target) {
        int dam = axe.attack(target);
        System.out.println(this.getName() + "(" + this.getHp() + ")" + 
                            " attacked " + target.getName() + "(" + target.getHp() + ")"
                             + " with " + axe.getWeaponType() + " for " + dam + " damage");


    }
}