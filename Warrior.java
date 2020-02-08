
import java.util.*;

public class Warrior extends Character{
    private Weapon poisonSword;

    public Warrior(int xp, String weakTo, String name, int howFast){
        super(xp, weakTo, name, howFast);
        poisonSword = new PoisonSword(25, "Poison", 40);
    }

    public void chooseAction(Character target){
        Scanner input = new Scanner(System.in);
        String action = "";
        int health = 0;
        while(true){
            try{
                health = getHp();
                System.out.println("What do you want to do? (a)Attack or (h)Heal? ");
                action = input.nextLine();
                if(action.equals("a")||action.equals("A")){
                    System.out.println();
                    int dam = poisonSword.attack(target);
                    System.out.printf("%s attacked %s and it lost %d hp.", getName(), target.getName(), dam);
                    System.out.println();
                    break;
                }
    
                else if(action.equals("h")|| action.equals("H")){
                    int increase = this.getMaxHp();
                    System.out.println();
                    this.heal((int)(increase*.25));
                    System.out.printf("%s gained %d hp.", getName(),getHp());
                    System.out.println();
                    break;
                }

                else if(!(action.equals("a")) || !(action.equals("A")) || !(action.equals("h")) || !(action.equals("H"))){
                    System.out.println("You must type  a or h");
                    continue;
                    
                }
            
            }            

            catch(Exception e){
                System.out.println("You must type a or h");
            }
            
        }
        
            
            

        
            
            
        

    }


}