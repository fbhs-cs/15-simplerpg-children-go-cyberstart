import java.util.Scanner;

public class Archer extends Character {
    private Weapon bow;

    public Archer(int xp , String weakTo, String name, int speed) {
        super(xp, weakTo, name, speed);
        bow = new Bow(30, "Piercing", 25);
        
    }
    @Override
    public void chooseAction(Character target){
        Scanner input = new Scanner(System.in);
        String action = "";
        int health = 0;
        while(true){
            try{
                health = getHp();
                System.out.println("What do you want to do? (a)Attack or (h)Heal? ");
                action = input.nextLine().toLowerCase();
                if(action.equals("a")){
                    System.out.println();
                    int dam = bow.attack(target);
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

                else if(!(action.equals("a")) || !(action.equals("h"))){
                    System.out.println("You must type a or h");
                    continue;
                    
                }
            
            }            

            catch(Exception e){
                System.out.println("You must type a or h");
            }
            
        }
        
    }

    // @Override
    // public void chooseAction(Character target){
    //     Scanner input = new Scanner(System.in);
    //     int health = 0;
    //     String action = "";
    //     while(true){
    //         try {
    //             health = getHp();
    //             System.out.println("What do you want to do? (a)Attack or (h)Heal? ");
    //             action = input.nextLine();
    //             if(action.equals("a")||action.equals("A")){
    //                 System.out.println();
    //                 int dam = bow.attack(target);
    //                 System.out.printf("%s attacked %s and it lost %d hp.", getName(), target.getName(), dam);
    //                 System.out.println();
    //                 break;
    
    //             }
    //             else if(action.equals("h")|| action.equals("H")){
    //                 int increase = this.getMaxHp();
    //                 System.out.println();
    //                 this.heal((int)(increase*.25));
    //                 System.out.printf("%s gained %d hp.", getName(),health);
    //                 System.out.println();
    //                 break;
    
    //             }
                
    //             else if (!action.toLowerCase().equals("a") || !action.toLowerCase().equals("r")) {
    //                 System.out.println("Type either an \"a\" or \"h\"");
    //                 continue;
    //             }
    //         }
    //         catch (Exception e) {
    //             System.out.println("Type either an \"a\" or \"h\"");
    //         }

    //     }
    //     input.close();
    // }
}