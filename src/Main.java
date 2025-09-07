// Main.java
public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };

        for (Animal a : animals) {
            a.makeSound();  // Dog→Woof!, Cat→Meow! が出るはず

            if(a instanceof Walkable) {
                ((Walkable) a).walk();
            }

        }
    }
}