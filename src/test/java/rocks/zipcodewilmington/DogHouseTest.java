package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDogToDogHouse(){
        DogHouse dogHouseTest = new DogHouse();
        Dog testdog1 = new Dog("g",new Date(), 2056);

        dogHouseTest.add(testdog1);
        Integer expect = 1;
        Integer actual = dogHouseTest.getNumberOfDogs();
        Assert.assertEquals(actual,expect);
    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testremoveDogByIDFromToDogHouse() {
        DogHouse dogHouse = new DogHouse();
        Dog testdog1 = new Dog("g", new Date(), 2056);

        dogHouse.add(testdog1);
        dogHouse.remove(2056);

        Integer expect = 0;
        Integer actual = dogHouse.getNumberOfDogs();
        Assert.assertEquals(actual, expect);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testremoveDogBydogOjectFromDogHouse() {
        DogHouse dogHouse = new DogHouse();
        Dog testdog1 = new Dog("g", new Date(), 2056);

        dogHouse.add(testdog1);
        dogHouse.remove(testdog1);

        Integer expect = 0;
        Integer actual = dogHouse.getNumberOfDogs();
        Assert.assertEquals(actual, expect);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogByIdFromToDogHouse() {
        DogHouse dogHouse = new DogHouse();
        Dog testdog1 = new Dog("g", new Date(), 2056);
        dogHouse.add(testdog1);



        Dog  expect =  testdog1;
        Dog  actual = dogHouse.getDogById(2056);
        Assert.assertEquals(expect,actual );
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogsIsZero(){
        DogHouse dogHouse = new DogHouse();
       Integer expect = 0;
       Integer actual = dogHouse.getNumberOfDogs();
       Assert.assertEquals(expect,actual);
        Assert.assertNotNull(dogHouse);
    }

    //***********************************************************

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
