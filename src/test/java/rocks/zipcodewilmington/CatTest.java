package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {



    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
        String givenName = "Fat Cat";
        Date birthDate = new Date();
        Integer Id = 10;
        Cat cat = new Cat( givenName , birthDate, Id);

        ;
        String expect = givenName;
        String actual = cat.getName();
        Assert.assertEquals(expect, actual);

    }
    // TODO - Create tests for `speak`

    @Test
    public void TestSpeak(){
        String givenName = "Fat Cat";
        Date birthDate = new Date();
        Integer Id = 10;
        Cat cat = new Cat( givenName , birthDate, Id);
        String expect = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expect, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void TestDateOfBrith(){
        String givenName = "Fat Cat Lie";
        Date birthDate = new Date();
        Integer Id = 10;
        Cat cat = new Cat( givenName , birthDate, Id);
        Date expect = birthDate;
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expect, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void TestEat(){
        String givenName = "Fat Cat Lie";
        Date birthDate = new Date();
        Integer Id = 10;
        Food food = new Food();
        Cat cat = new Cat( givenName , birthDate, Id);

        cat.eat(food);
        Integer expect = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expect, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testId(){
        String givenName = "Fat Cat";
        Date birthDate = new Date();
        Integer Id = 500;
        Cat cat = new Cat( givenName , birthDate, Id);

        ;
        Integer expect = Id;
        Integer actual = cat.getId();
        Assert.assertEquals(expect, actual);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
            public void testAnimal() {
        String givenName = "Fat Cat";
        Date birthDate = new Date();
        Integer Id = 500;
        Cat cat = new Cat(givenName, birthDate, Id);

        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInHeritance(){
        String givenName = "Fat Cat";
        Date birthDate = new Date();
        Integer Id = 500;
        Cat cat = new Cat( givenName , birthDate, Id);
        Assert.assertTrue(cat instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
