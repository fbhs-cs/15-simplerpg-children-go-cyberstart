import java.util.Scanner;

public class Archer extends Character {
    private Weapon bow;

    public Archer(int xp , String weakTo, String name, int speed) {
        super(xp, weakTo, name, speed);
        bow = new Bow(30, "Piercing", 25);
        
    }

    @Override
    public void chooseAction(Character target) {
        Scanner s = new Scanner(System.in);
        System.out.println("What would " + this.getName() + " like to do?");
        System.out.println("1. Attack \n2. Heal");
        
        String ans = s.nextLine();

        if (ans.equals("1")) {
            int dam = bow.attack(target);
            System.out.println(this.getName() + "(" + this.getHp() + ")" + 
                            " attacked " + target.getName() + "(" + target.getHp() + ")"
                             + " with " + bow.getWeaponType() + " for " + dam + " damage");
        }
        else if (ans.equals("2")) {
            int increase = this.getMaxHp();
            this.heal((int)(increase * .25));
        }

        s.close();


    }
}