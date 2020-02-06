import java.util.*;
public class Mage extends Character{

    private Spell Fire;
        
    
    public Mage(int xp , String weakTo, String name, int speed) {
        super(xp, weakTo, name, speed);
        
    }

    public void chooseAction(Character target){
        Scanner input = new Scanner(System.in);
        int health = getHp();
        System.out.println("What do you want to do? Run(r), Cast(c), and Heal(h). ");
        String action = input.next();
        if(action.equals("r")){
            setHp(health/2);
            System.out.println("You've run away but the enemy attacked you! Youve lost half your healh leaving you at" + getHp() +" left.");
        }
        else if(action.equals("c")){
            Fire.cast(this, target);
        }
        else if(action.equals("h")){
            int heals = this.getHp();
            this.heal(heals/4);
        }

        input.close();
    }

}
}
