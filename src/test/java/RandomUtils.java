import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class RandomUtils {

    Faker faker = new Faker(new Locale("en"));

    public String generName() {
        return faker.name().firstName();
    }

    public String generLastName() {
        return faker.name().lastName();
    }

    public String generEmail() {
        return faker.internet().emailAddress();
    }

    public int generRandomNumberElementOfList(List<String> someList) {
        return faker.number().numberBetween(0, someList.toArray().length);
    }

    public String generPhoneNumber(int length) {
        return faker.phoneNumber().subscriberNumber(length);
    }

    public int generSomeNumber(int first, int last) {
        return faker.number().numberBetween(first, last);
    }

    public File generFile(String path) throws IOException {
        return Files.createFile(Path.of(path, faker.file().fileName("", null, null, "/"))).toFile();
    }

    public String generAddress() {
        return faker.address().fullAddress();
    }

}
