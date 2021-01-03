public class Human {
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setStealth(int stealth){
        this.stealth = stealth;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public int getStrength(){
        return this.strength;
    }
    public int getStealth(){
        return this.stealth;
    }
    public int getIntelligence(){
        return this.intelligence;
    }
    public int getHealth(){
        return this.health;
    }

    public void attack(Human target){
        target.health -= this.strength;
        System.out.println(target.health + " Health remaining");
    }
}