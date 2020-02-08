
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
                System.out.println("What do you want to do? (r)Run, (a)Attack or (h)Heal? ");
                action = input.nextLine();
                if(!action.equals("a") || !action.equals("A") || !action.equals("r") || !action.equals("R") || !action.equals("r") || !action.equals("h") || !action.equals("H")){
                    System.out.println("You must type a, r, h");
                    
                }
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
                    System.out.printf("%s gained %d hp.", getName(),getHp());
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

            catch(Exception e){
                System.out.println("You must type a, r, h");
            }
            
        }
            
            
        input.close();

    }


}