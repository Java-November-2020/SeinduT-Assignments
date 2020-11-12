public class Gorilla extends Mammal {

    public void throwSomething() {
        System.out.println("After threwing something energy has decreased by 5");
        energyLevel -= 5;
    }
    
    public void eatBanana() {
        System.out.println("After eating a banana energy has increased by 10");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("After climbing energy has decreased by 10");
        energyLevel -= 10;
    }
}