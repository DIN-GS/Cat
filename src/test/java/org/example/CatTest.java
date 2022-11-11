package org.example;

import junit.framework.TestCase;

public class CatTest extends TestCase {
    public void testWhatIsCatDoing() {
        Cat cat = new Cat("White", 2, "Британська короткошерста");

        assertEquals("Cat is sleeping",cat.whatIsCatDoing(Days.Monday));

    }

    public void testTestEquals() {
        Cat cat = new Cat("White", 2, "Британська короткошерста");
        Cat cat2 = new Cat("White", 2, "Британська короткошерста");

        assertEquals(true, cat.equals(cat2));

    }

}