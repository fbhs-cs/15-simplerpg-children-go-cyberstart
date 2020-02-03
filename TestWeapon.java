public class TestWeapon
{
    public static void main(String[] args) 
    {
        
        // Tests for the Weapon Class.
        
        Character character1 = new Character();
        Character character2 = new Character();
        Character enemy = new Character(10, "jacob","oxygen",100);
        Character enemy2 = new Character(10, "none", "leroy Jr.", 100);

        Weapon KORMANDU = new Weapon( 100, "KNIFE", 20);
        // Test for damage amount.
        System.out.println("Damage of weapon "+ KORMANDU.getDmg());
        // Test for Damage Type.
        System.out.println("Damage type of weapon "+ KORMANDU.getDmgType());
        // Test for weapon type.
        System.out.println("Type of weapon "+ KORMANDU.getWeaponType());
        System.out.println("Type of weapon "+ KORMANDU.getWeaponType());
        // Test for possible critical attack.
        System.out.println("Critical attack of weapon "+ KORMANDU.getCrit());
        // Test for the action damage.
        System.out.println("Attack damage "+ KORMANDU.attack(character1));



    }
}