package fr.arsenelapostolet.animals;

import fr.arsenelapostolet.app.Animal;

public abstract class Pet implements Animal {

    private String test;

    public void pet(){
        System.out.println("The pet is happy");
    }

    public void eat(){
        String food = this.getFood();
        System.out.println("The pet is feed with : " + food);
    }

    protected abstract String getFood();

}
