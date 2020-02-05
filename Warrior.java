
import java.util.*;

public class Warrior extends Character{
    private Weapon PoisonSword;

    public Warrior(int xp, String weakTo, String name, int howFast){
        super(100,"fire", name, 20 );
    }

    public void chooseAction(Character target){
        Scanner input = new Scanner(System.in);
        int health = getHp();
        System.out.println("What do you want to do? (r)Run, (a)Attack or (h)Heal? ");
        String action = input.next();
        if(action.equals("a")||action.equals("A")){
            PoisonSword.attack(target);


        }
        if(action.equals("h")|| action.equals("H")){
            int increase = this.getMaxHp();
            this.heal((int)(increase*.25));



        }
        if(action.equals("r")||action.equals("R")){
            setHp(health/2);
        }








        input.close();

    }


}