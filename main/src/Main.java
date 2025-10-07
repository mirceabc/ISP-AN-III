void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Animal dog = new Dog();
    Cat cat = new Cat();
    dog.sound();
    cat.sound();
    dog=new Cat();
    dog.sound();
}