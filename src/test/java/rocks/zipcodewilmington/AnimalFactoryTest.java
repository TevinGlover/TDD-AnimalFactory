package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
Dog dog;
Cat cat;
Integer id;
    @Before
    public void setup(){
        this.dog.setBirthDate(new Date());
        this.dog.setName("dido");
        this.id = 12;

        dog = new Dog(dog.getName(), dog.getBirthDate() , dog.getId());
        cat = new Cat(cat.getName(), cat.getBirthDate(), cat.getId());
    }

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testAnimalCreateDog(){



        Assert.assertNotNull(dog.getName());

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
