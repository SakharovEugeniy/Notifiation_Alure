import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationFormWithPageObjTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    GenerationData generationData = new GenerationData()
            .setGenerName()
            .setGenerLastName()
            .setGenerEmail()
            .setGenerGender()
            .setGenerPhoneNumber()
            .setGenerDayBirth()
            .setGenerMonthBirth()
            .setGenerYearBirth()
            .setGenerSubject()
            .setGenerHobbies()
            .setGenerFileName()
            .setGenerAddress()
            .setGenerState()
            .setGenerCity();


    @Test
    public void registrationFullFormWithPageObjTest() {

        registrationPage.openPage()
                .setName(generationData.getName())
                .setLastName(generationData.getLastName())
                .setEmail(generationData.getEmail())
                .setGender(generationData.getGender())
                .setUserNumber(generationData.getPhoneNumber())
                .setDate(generationData.getDayBirth(), generationData.getMonthBirth(), generationData.getYearBirth())
                .setSubjects(generationData.getSubject())
                .setHobbies(generationData.getHobbies())
                .loadPicture(generationData.getFileName())
                .setAddress(generationData.getAddress())
                .setState(generationData.getState())
                .setCity(generationData.getCity())
                .pressSubmit()
                .checkResponseField("Student Name", generationData.getName())
                .checkResponseField("Student Email", generationData.getEmail())
                .checkResponseField("Gender", generationData.getGender())
                .checkResponseField("Mobile", generationData.getPhoneNumber())
                .checkResponseField("Date of Birth", generationData.getDayBirth() + " " + generationData.getMonthBirth()
                        + "," + generationData.getYearBirth())
                .checkResponseField("Subjects", generationData.getSubject())
                .checkResponseField("Hobbies", generationData.getHobbies())
                .checkResponseField("Picture", generationData.getFileName())
                .checkResponseField("Address", generationData.getAddress())
                .checkResponseField("State and City", generationData.getState() + " " + generationData.getCity());
    }


    @Test
    public void registrationMinimalFormWithPageObjTest() {

        registrationPage.openPage()
                .setName(generationData.getName())
                .setLastName(generationData.getLastName())
                .setGender(generationData.getGender())
                .setUserNumber(generationData.getPhoneNumber())
                .setDate(generationData.getDayBirth(), generationData.getMonthBirth(), generationData.getYearBirth())
                .pressSubmit()
                .checkResponseField("Student Name", generationData.getName() + " " + generationData.getLastName())
                .checkResponseField("Gender", generationData.getGender())
                .checkResponseField("Mobile", generationData.getPhoneNumber())
                .checkResponseField("Date of Birth", generationData.getDayBirth() + " " + generationData.getMonthBirth()
                        + "," + generationData.getYearBirth());
    }


    @Test
    public void registrationEmptyFormWithPageObjTest() {

        registrationPage.openPage()
                .pressSubmit()
                .wasValidate();
    }

}
