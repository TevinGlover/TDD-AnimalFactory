package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {


    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testAnimalCreateDog(){
      Dog newDog =  AnimalFactory.createDog("Lion", new Date(2023,04,12));


        Date   actualDOB = new Date(2023,04,12);
        Date   expectedDOB = newDog.getBirthDate();
        String  actualName = "Lion";
        String  expectedName = newDog.getName();
        Assert.assertNotNull(newDog);
        Assert.assertEquals(expectedDOB,actualDOB);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertNotNull(newDog.getId());// how dos it create a Id??
        System.out.println(newDog.getId() + " this is the dog id");// i wonder how this works.
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testAnimalCreateCat(){
        Cat newCat = AnimalFactory.createCat("Wolf", new Date(2014,04,12));



        Date   actualDOB = new Date(2014,04,12);
        Date   expectedDOB = newCat.getBirthDate();

        String  actualName = "Wolf";
        String  expectedName = newCat.getName();
        Assert.assertNotNull(newCat.getId());
        Assert.assertEquals(expectedDOB,actualDOB);
        Assert.assertEquals(expectedName,actualName);
       Assert.assertNotNull(newCat);
        Assert.assertNotNull(newCat.getId());// how dos it create a Id??
        System.out.println(newCat.getId() + " this is the cat id");// i wonder how this works.
        // i understand now the id is created  by what order the Animal factor creates them or
        // the order   their place in the house dog house. nice.

    }
}
