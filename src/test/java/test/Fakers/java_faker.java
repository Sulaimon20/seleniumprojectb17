package test.Fakers;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class java_faker {
    @Test
    public void faker_test(){


        Faker faker = new Faker();


        long number = faker.number().randomDigit();
        System.out.println("number = " + number);
        /*
        String name = faker.name().fullName(); // Miss Samanta Schmidt
        System.out.println("name = " + name);
        String firstName = faker.name().firstName(); // Emory
        System.out.println("firstName = " + firstName);
        String lastName = faker.name().lastName(); // Barton
        System.out.println("lastName = " + lastName);
        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        System.out.println("streetAddress = " + streetAddress);
        String chuckNorris=faker.chuckNorris().fact();
        System.out.println("chuckNorris = " + chuckNorris);
        String Shakespeare=faker.shakespeare().hamletQuote();
        System.out.println("Shakespeare = " + Shakespeare);
*/

    }
}