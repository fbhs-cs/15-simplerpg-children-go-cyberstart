import java.util.*;
public class Mage extends Character{

    private Spell Fire;
        
    
    public Mage(int xp , String weakTo, String name, int speed) {
        super(xp, weakTo, name, speed);
        
    }

    public void chooseAction(Character target){
        Scanner input = new Scanner(System.in);
        System.out.print("What do you want to do? Run(r), Cast(c) ");
        String action = input.next();
        if(action.equals("r")){

        }



        
    }

}
