package fr.arsenelapostolet;

import fr.arsenelapostolet.animals.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void catShout_returnsMiaou(){
        // Given
        Cat cat = new Cat();

        // When
        String result = cat.shout();

        // Then
        assertEquals("Miaou, miaou !", result);
    }

}
