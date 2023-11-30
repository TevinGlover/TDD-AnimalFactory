package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getCatById;
import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getNumberOfCats;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        // give
        CatHouse house = new CatHouse();
        String givenName = "Fat Cat";
        Date birthDate = new Date();
        Integer Id = 10;
        Cat cat = new Cat( givenName , birthDate, Id);

        //when
        CatHouse.add(cat);
        int  actual = house.getNumberOfCats();
        int expected = 1;

        Assert.assertEquals(expected,actual);//then
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById(){
        CatHouse catHouse = new CatHouse();//GIVEN START
        String givenName = "Fat Cat";
        Date birthDate = new Date();
        Integer Id = 56432;
        Cat cat = new Cat( givenName , birthDate, Id);
        CatHouse.add(cat);//GIVEN STOP

        catHouse.remove(56432);//WHEN START
        Integer actual = catHouse.getNumberOfCats();
        Integer expected = 0; //WHEN STOP

       Assert.assertEquals(expected,actual); //Then
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveByCat() {
        CatHouse catHouse = new CatHouse();//GIVEN START
        String givenName = "Fat Cat";
        Date birthDate = new Date();
        Integer Id = 56432;
        Cat cat = new Cat(givenName, birthDate, Id);
        CatHouse.add(cat);//GIVEN STOP

        catHouse.remove(cat);//WHEN START
        Integer actual = catHouse.getNumberOfCats();
        Integer expected = 0; //WHEN STOP

        Assert.assertEquals(expected, actual); //Then
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void testgetById() {
        CatHouse catHouse = new CatHouse();//GIVEN START
        //cat 1
        String givenName = "Fast Cat";
        Date birthDate = new Date();
        Integer Id = 56409;
        Cat cat1 = new Cat(givenName, birthDate, Id);
        //cat2
        String name = "Fat Cat";
        Date dOB = new Date();
        Integer Id2 = 56432;
        Cat cat0 = new Cat(name, dOB, Id2);
        CatHouse.add(cat0);
        CatHouse.add(cat1);//GIVEN STOP


        Cat actual = catHouse.getCatById(56432);//WHEN START
        Cat expected = cat0; //WHEN STOP

        Assert.assertEquals(expected, actual); //Then
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCatIsZero(){
        CatHouse House = new CatHouse();
        Integer expect = 0;
        Integer actual = House.getNumberOfCats();
        Assert.assertEquals(expect,actual);
        Assert.assertNotNull(House);
    }

    //***********************************************************

}
