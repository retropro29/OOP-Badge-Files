package OOP.oop;

public class Runner {
    public static void main(String[] args) {
        Cat cat1;
        Dog dog1;
        Bird bird1;

        Animal[] animals = {
            cat1 = new Cat("Fire Blanket", 7),
            dog1 = new Dog("fax Office", 15),
            bird1 = new Bird("Copy Paper", 3)
        };


        for (int i=0; i < animals.length; i++){
            animals[i].animalSound();
            animals[i].describe();
        }
    }
}
