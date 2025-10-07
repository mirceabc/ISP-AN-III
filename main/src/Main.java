void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Animal dog = new Dog();
    Cat cat = new Cat();
    dog.Sound();
    cat.Sound();
}

static class Animal
{
    void Sound()
    {
        System.out.println("I am an animal");
    }
}

static class Dog extends Animal
{
    void Sound()
    {
        System.out.println("Bark");
    }
}

static class Cat extends Animal
{
    void Sound()
    {
        System.out.println("Meow");
    }
}