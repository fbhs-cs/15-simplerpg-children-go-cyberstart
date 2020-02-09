import java.util.*;
public class Mage extends Character{

    private Spell Fire;
        
    
    public Mage(int xp , String weakTo, String name, int speed) {
        super(xp, weakTo, name, speed);
        Fire = new Fire(40, "Fire", 30);
    }

    public void chooseAction(Character target){
        Scanner input = new Scanner(System.in);
        String action = "";
        int health = 0;

        while(true){
            try{
                health = getHp();
                System.out.println("What do you want to do? Cast(c) or Heal(h) ");
                action = input.nextLine();

                
                if(action.equals("c") || action.equals("C")){
                    System.out.println();
                    int dam =  Fire.cast(this, target);
                    System.out.printf("%s attacked %s and it lost %d hp.", getName(), target.getName(), dam);
                    System.out.println();
                    break;
                }

                else if(action.equals("h")){
                    int increase = this.getMaxHp();
                    System.out.println();
                    this.heal((int)(increase*.25));
                    System.out.printf("%s gained %d hp.", getName(),getHp());
                    System.out.println();
                    break;
                }

                else if(!(action.equals("c")) || !(action.equals("C")) || !(action.equals("h")) || !(action.equals("H"))){
                    System.out.println("You must type  c or h");
                    continue;
                    
                }


            }
            catch(Exception e){
                System.out.println("You must type c or h");
            }
        }
        
    
    }

}