package OOP.dog; 

import OOP.dog.Dog; 

public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Cupcake","pitbull", true);
        Dog dog2 = new Dog("Cookie","poodle", false);

        if (dog1.winInFight() && !dog2.winInFight()){
            System.out.println(dog1.getName() + " Won");
        }
        else if (!dog1.winInFight() && dog2.winInFight()){
            System.out.println(dog2.getName() + " Won");
        }
        else{
            System.out.println("The dogs tied");
        }

        dog1.bark();

        // 4. The code below makes a new instance of Dog named henry and then calls bark() on it. 
        // Dog henry = new Dog("Henry", __, __); 
        // henry.bark(); 
    }
}