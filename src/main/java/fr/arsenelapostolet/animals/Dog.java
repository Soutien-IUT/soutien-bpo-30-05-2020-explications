package fr.arsenelapostolet.animals;

public class Dog extends Pet {
    private DogMouth mouth;

    @Override
    public String shout() {
        return mouth.shout();
    }

    @Override
    protected String getFood() {
        return null;
    }
}
