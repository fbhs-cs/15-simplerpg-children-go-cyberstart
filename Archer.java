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
        
        String ans = s.nextLine();

        while (true) {
            try {
                System.out.println("What would " + this.getName() + " (" + this.getHp() + ")" + " like to do?");
                System.out.println("1. Attack \n2. Heal\n3. Run");
        
                if (ans.equals("1")) {
                    int dam = bow.attack(target);
                    System.out.println(this.getName() + "(" + this.getHp() + ")" + 
                                    " attacked " + target.getName() + "(" + target.getHp() + ")"
                                     + " with " + bow.getWeaponType() + " for " + dam + " damage");
                }
                else if (ans.equals("2")) {
                    int increase = this.getMaxHp();
                    this.heal((int)(increase * .25));
                    System.out.println(this.getName() + " healed to " + this.getHp());
                }
                else if (ans.equals("3")) {
                    this.setHp(this.getHp()/2);
                    System.out.println(this.getName() + " escaped but left with half of its health -> " + this.getHp());
                }
                break;
            }
            catch (Exception e){
                System.out.println("Enter in either 1, 2, or 3");
            }
        }


        s.close();


    }
    public static void main( String[] args) {
        Character ye = new Archer(500, "Ice", "Andre", 100);
        Character en = new Ghoul(100, "Piercing", "stinky", 50);
        ye.chooseAction(en);
    }
}