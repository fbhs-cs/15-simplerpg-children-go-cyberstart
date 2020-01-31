public class TestSpell
{
    public static void main(String[] args) 
    {
        Character character1 = new Character();
        Character character2 = new Character();
        Character enemy = new Character(10, 10, "jacob", "leroy", 100, 20);
        Character enemy2 = new Character(10, 10, "none", "leroy Jr.", 100, 20);

        Spell destroy = new Spell( 5, "jacob", 2);

        // System.out.println(character1); // toString methods do not print everything       
        // System.out.println(enemy);      

        System.out.println(destroy); // test toString 
        
        // test if enemy is weak to spell

        System.out.println("enemy's health is " + enemy.getHp());
        System.out.println("Character1's mana is " + character1.getMana());
        System.out.println();
        System.out.println("Character1 casts 'destroy' on enemy!");

        destroy.cast(character1, enemy);

        System.out.println("enemy's health is " + enemy.getHp());   
        System.out.println("Character1's mana is " + character1.getMana());   
        
        System.out.println(); // test character is not weak to spell

        System.out.println(enemy2.name+ "'s health is " + enemy2.getHp());
        System.out.println("Character2's mana is " + character2.getMana());
        System.out.println();
        System.out.println("Character2 casts 'destroy' on enemy2!");

    
        destroy.cast(character2, enemy2);

        System.out.println(enemy2.name + "'s health is " + enemy2.getHp());   
        System.out.println("Character1's mana is " + character2.getMana());  

        // System.out.println(character1); // toString methods do not print everything       
        // System.out.println(enemy); 

    }
}