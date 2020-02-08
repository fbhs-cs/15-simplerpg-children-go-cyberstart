
import java.util.*;

public class Warrior extends Character{
    private Weapon poisonSword;

    public Warrior(int xp, String weakTo, String name, int howFast){
        super(xp, weakTo, name, howFast);
        poisonSword = new PoisonSword(25, "Poison", 40);
    }

    public void chooseAction(Character target){
        Scanner input = new Scanner(System.in);
        while(true){
            int health = getHp();
            System.out.println("What do you want to do? (r)Run, (a)Attack or (h)Heal? ");
            String action = input.next();
            if(action.equals("a")||action.equals("A")){
                System.out.println();
                int dam = poisonSword.attack(target);
                System.out.printf("%s attacked %s and it lost %d hp.", getName(), target.getName(), dam);
                System.out.println();


            }
            else if(action.equals("h")|| action.equals("H")){
                int increase = this.getMaxHp();
                System.out.println();
                this.heal((int)(increase*.25));
                System.out.println();



            }
            else if(action.equals("r")||action.equals("R")){
                setHp(health/2);
                System.out.println();
                System.out.printf("You escaped barely surviving, only having %d hp left", this.getHp());
                System.out.println();
            }
            break;

        }
        
        input.close();

    }


}