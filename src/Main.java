public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal silentDog = new Dog();
        silentDog.soundBehavior = new SilentSound(); // 鳴き方を差し替え

        dog.performSound();     // Woof! Woof!
        cat.performSound();     // Meow! Meow!
        silentDog.performSound(); // ...
    }
}
