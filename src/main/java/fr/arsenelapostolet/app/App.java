package fr.arsenelapostolet.app;

import fr.arsenelapostolet.animals.AnimalFactory;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnimalFactory factory = new AnimalFactory();

        List<Animal> animals = List.of(
                factory.createAnimal("cat"),
                factory.createAnimal("dog"),
                factory.createAnimal("cat")
        );

        for (Animal animal: animals) {
            animal.shout();
        }
    }
}
