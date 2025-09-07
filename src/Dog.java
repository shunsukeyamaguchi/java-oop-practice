// Dog.java
public class Dog extends Animal implements Walkable {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void walk(){
        System.out.println("Dog is Walking...");
    }

}