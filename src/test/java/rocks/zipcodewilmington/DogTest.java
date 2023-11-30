package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    Dog dog;
    Integer id;
    ArrayList<Food> eatenMeals;
    Food dogfood1;
    Food dogfood2;
    String name;
    Date birthDate;

    @Before
    public void setup(){// Given
        //dog = new Dog(name, birthDate , id);
        this.birthDate = new Date();
        this.name = "joe";
        this.eatenMeals = new ArrayList<>();
        this.id = 12345;
        this.dogfood1= new Food();
        this.dogfood2= new Food();
        dog = new Dog(name, birthDate , id);// must be set below.

    }
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testConstructor(){
        //when

        Assert.assertNotNull(dog);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){

        String actual = dog.speak();//when
        String expected = "bark!";

        Assert.assertEquals(actual,expected);// Then (we expect to get the given name from the dog)
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testsetBirthDate(){
        // when
       Date expected = birthDate;
       Date actual = dog.getBirthDate();

       Assert.assertEquals(actual, expected); //then
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEatfood(){
        //when
        dog.eat(dogfood1);
        dog.eat(dogfood2);
        int expected = 2;
        int actual = dog.getNumberOfMealsEaten();// used the method
       Assert.assertEquals(expected,actual);
    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        Integer expected = id;
        Integer actual = dog.getId();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInHeritance(){
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInHeritance(){
        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
