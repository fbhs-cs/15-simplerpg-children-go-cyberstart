
public class Character{
    public int hp;
    public int xp;
    public int speed;
    public String weakness;
    public String name;

    public Character(int health,int experience, String weakTo, String nm, int howFast){
        hp = health;
        xp = experience;
        weakness = weakTo;
        name = nm;
        speed = howFast;
    }
    public Character() {
        hp = xp/10;
        xp = 1000;
        weakness = "Oxygen.";
        name = "Bogart the Smelly aka THE FLASK";
        speed = 1000;
    }

    public int getHp(){
        return this.hp;
    }
    public void setHp(int newHp){
         this.hp = newHp;
    }
    public void addXP(int expVal){
        this.xp +=expVal;
    }
    public int getXP(){
        return this.xp;
    }
    // Level is exponential
    public int getLevel(){
        int count = 0;
        int i = 2;
        while(i< xp){
            i = i*i;
            count++;
        }
        return count;
    }
    public void setLevel(double desiredLvl){
        xp = (int)Math.pow(2.0, desiredLvl);
    }
    public void takeDamage(int damage){
        hp -= damage;
    }
    public boolean isWeakTo(String type){
        if(type.equals(weakness)){
            return true;
        }
        return false;
        }
    public void heal(int increase){
        if(increase < this.getMaxHp()){
            hp = this.getMaxHp();
        }else{
            hp+=increase;
        }
    }
    public int getMaxHp(){
        int maxHp = xp/10;
        return maxHp;
    }
    public String getName(){
        return this.name;
    }
    public boolean isAlive



}






























    
}