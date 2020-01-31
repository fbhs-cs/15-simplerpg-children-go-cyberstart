public class TestWeapon
{
    public static void main(String[] args) 
    {
        Character character1 = new Character();
        Character character2 = new Character();
        Character enemy = new Character(10, 10, "jacob", "leroy", 100, 20);
        Character enemy2 = new Character(10, 10, "none", "leroy Jr.", 100, 20);

        Weapon KORMANDU = new Weapon( 100, "KNIFE", 20);

        System.out.println("Damage of weapon "+ KORMANDU.getDmg());
        System.out.println("Damage type of weapon "+ KORMANDU.getDmgType());
        System.out.println("Type of weapon "+ KORMANDU.getWeaponType());
        System.out.println("Type of weapon "+ KORMANDU.getWeaponType());
        System.out.println("Critical attack of weapon "+ KORMANDU.getCrit());
        System.out.println("Attack damage "+ KORMANDU.attack(character1));



    }
}