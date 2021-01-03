public class Samurai extends Human{
    private static int numSamurai = 0;
    public Samurai(){
        this.health = 200;
    }

    public void deathBlow(Human target){
        target.health * 0;
        this.health = (this.health / 2) ;
    }

    public void meditate(){
        this.health = this.health + (this.health / 2);
    }

    public static int howMany(){
        return Samurai.numSamurai;
    }
}