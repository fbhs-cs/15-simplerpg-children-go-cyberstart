public class TestCharacter{

    public static void testDefaultCharacter(){
        Character def = new Character();
        def.toString();
        System.out.println();

        def.setHp(10);
        int newHp = def.getHp();
        System.out.println("Bogart now has " + newHp + " hp.");
        System.out.println();

        int level = def.getLevel();
        System.out.println("Bogart is at level "+ level + ".");
        def.setLevel(2);

        boolean alive = def.isAlive();
        System.out.println("Is Bogart alive? "+alive);
        System.out.println();

        def.setMana(40);
        def.toString();




        



    }

    public static void testCharacterSha(){
        Character shalissa = new Character(10,50,"Beyonce", "Shalissa",200, 30 );
        shalissa.toString();
        System.out.println();

        String name = shalissa.getName();
        System.out.println(name+"'s should be Shalissa.");
        System.out.println();


        shalissa.addXP(69);
        int newXP = shalissa.getXP();
        System.out.println("Shalissa bossed up and now has "+ newXP + " xp.");
        System.out.println();

        shalissa.takeDamage(10);
        shalissa.toString();

        boolean weak = shalissa.isWeakTo("Snakes");
        System.out.println("Shalissa is weak to Snakes?: "+weak+" ");
        System.out.println();

        shalissa.heal(5);
        shalissa.toString();

        int speed = shalissa.getSpeed();
        System.out.println("Shalissa's speed is "+speed);



        


    }







    public static void main(String[] args){
        testDefaultCharacter();
        //testCharacterSha();

    }
}