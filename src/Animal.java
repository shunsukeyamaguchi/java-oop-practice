public abstract class Animal {
    protected SoundBehavior soundBehavior;

    public void performSound() {
        soundBehavior.makeSound();
    }
}
