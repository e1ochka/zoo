package zoo.main;

import zoo.animals.*;
import zoo.enclosure.*;

public class Main {
    public static void main(String[] args) {
        Lion leo = new Lion("Leo", 5, "Golden");
        System.out.println(leo.makeSound()); // Вывод: Roar!
        System.out.println(leo.getDiet()); // Вывод: Carnivore

        Bird eagle = new Bird("Eagle", "Golden Eagle", 10, "2m");
        eagle.fly(); // Вывод: Eagle is flying!

        Fish nemo = new Fish("Nemo", "Clownfish", 2, "Fins");
        nemo.swim(); // Вывод: Nemo is swimming!

        Enclosure lionEnclosure = new Enclosure("Lion Enclosure", 1);
        lionEnclosure.addAnimal(leo, 0);

    }
}
