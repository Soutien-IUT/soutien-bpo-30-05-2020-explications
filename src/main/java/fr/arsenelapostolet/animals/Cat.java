package fr.arsenelapostolet.animals;

public class Cat extends Pet {
    @Override
    public String shout() {
        return "Miaou, miaou !";
    }

    @Override
    protected String getFood() {
        return "mouse";
    }
}
