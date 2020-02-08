public class Ghoul extends Character {
    private Weapon bow;

    public Ghoul(int xp, String weak, String name, int howFast) {
        super(xp, weak, name, howFast);
        bow = new Bow(30, "Piercing", 10);
    }

    @Override
    public void chooseAction(Character target) {
        int dam = bow.attack(target);
        System.out.println(this.getName() + "(" + this.getHp() + ")" + 
                            " attacked " + target.getName() + "(" + target.getHp() + ")"
                             + " with " + bow.getWeaponType() + " for " + dam + " damage");
            

    }
}