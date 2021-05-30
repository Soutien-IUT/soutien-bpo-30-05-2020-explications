package fr.arsenelapostolet.animals;

import fr.arsenelapostolet.app.Animal;

public class AnimalFactory {

    public Animal createAnimal(String type){
        return switch (type) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            default -> throw new IllegalArgumentException("Unsupported animal");
        };
    }

}
