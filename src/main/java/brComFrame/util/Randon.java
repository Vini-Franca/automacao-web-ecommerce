package brComFrame.util;

import com.github.javafaker.Faker;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

public class Randon {

    public static String getTextAleatorio() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static String generateName() {
        DataFactory df = new DataFactory();
        String name = df.getFirstName() + " " + df.getLastName();
        return name;
    }

    public static String fakeGenerator() {
        Faker faker = new Faker();
        return faker.name().fullName();
    }

}
