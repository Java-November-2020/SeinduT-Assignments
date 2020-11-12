public class Bat extends Mammal {

    public void fly() {
        System.out.println("Flying decreased the bat's energy by 50");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Nom Nom Eating Human increased the bat's energy by 25");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Attacking the town decreceased the bat's energy by 100");
        energyLevel -= 100;
    }
}