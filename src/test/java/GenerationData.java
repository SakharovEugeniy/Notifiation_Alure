import java.io.File;
import java.io.IOException;
import java.util.List;


public class GenerationData {

    RandomUtils randomUtils = new RandomUtils();

    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String phoneNumber;
    private String dayBirth;
    private String monthBirth;
    private String yearBirth;
    private String subject;
    private String hobbies;
    private String fileName;
    private String address;
    private String state;
    private String city;

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getAddress() {
        return address;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getFileName() {
        return fileName;
    }

    public String getSubject() {
        return subject;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDayBirth() {
        return dayBirth;
    }

    public String getMonthBirth() {
        return monthBirth;
    }

    public String getYearBirth() {
        return yearBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenerationData setGenerName() {
        this.name = randomUtils.generName();
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GenerationData setGenerLastName() {
        this.lastName = randomUtils.generLastName();
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GenerationData setGenerEmail() {
        email = randomUtils.generEmail();
        email = email.substring(email.indexOf('@'));
        email = name + email;
        return this;
    }

    public GenerationData setGenerGender() {
        gender = genderList.get(randomUtils.generRandomNumberElementOfList(genderList));
        return this;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public GenerationData setGenerPhoneNumber() {
        phoneNumber = randomUtils.generPhoneNumber(10);
        return this;
    }

    public void setDayBirth(String dayBirth) {
        this.dayBirth = dayBirth;
    }

    public GenerationData setGenerDayBirth() {
        int tmp = randomUtils.generSomeNumber(1, 28);
        if (tmp < 10) {
            dayBirth = "0" + tmp;
        } else {
            dayBirth = String.valueOf(tmp);
        }
        return this;
    }


    public void setMonthBirth(String monthBirth) {
        this.monthBirth = monthBirth;
    }

    public GenerationData setGenerMonthBirth() {
        monthBirth = month.get(randomUtils.generRandomNumberElementOfList(month));
        return this;
    }

    public void setYearBirth(String yearBirth) {
        this.yearBirth = yearBirth;
    }

    public GenerationData setGenerYearBirth() {
        int tmp = randomUtils.generSomeNumber(1925, 2007);
        yearBirth = String.valueOf(tmp);
        return this;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public GenerationData setGenerSubject() {
        subject = subjectsList.get(randomUtils.generRandomNumberElementOfList(subjectsList));
        return this;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public GenerationData setGenerHobbies() {
        hobbies = hobbiesList.get(randomUtils.generRandomNumberElementOfList(hobbiesList));
        return this;
    }

    public GenerationData setGenerFileName() {
        try {
            File file = randomUtils.generFile("build/resources/test");
            fileName = file.getName();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GenerationData setGenerAddress() {
        address = randomUtils.generAddress();
        return this;
    }

    public GenerationData setGenerState() {
        state = statesOfCity.get(randomUtils.generRandomNumberElementOfList(statesOfCity));
        return this;
    }

    public GenerationData setGenerCity() {
        if (state.equals("NCR")) {
            city = cityOfNCR.get(randomUtils.generRandomNumberElementOfList(cityOfNCR));
        } else if (state.equals("Uttar Pradesh")) {
            city = cityOfUttar.get(randomUtils.generRandomNumberElementOfList(cityOfUttar));
        } else if (state.equals("Haryana")) {
            city = cityOfHaryana.get(randomUtils.generRandomNumberElementOfList(cityOfHaryana));
        } else {
            city = cityOfRajasthan.get(randomUtils.generRandomNumberElementOfList(cityOfRajasthan));
        }
        return this;
    }

    private List<String> genderList = List.of("Male", "Female", "Other");
    private List<String> month = List.of("January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December");
    private List<String> subjectsList = List.of("Maths", "Physics", "Chemistry", "Biology", "English", "History", "Computer Science",
            "Commerce", "Hindi");
    private List<String> hobbiesList = List.of("Sports", "Reading", "Music");
    private List<String> statesOfCity = List.of("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    private List<String> cityOfNCR = List.of("Delhi", "Gurgaon", "Noida");
    private List<String> cityOfUttar = List.of("Agra", "Lucknow", "Merrut");
    private List<String> cityOfHaryana = List.of("Karnal", "Panipat");
    private List<String> cityOfRajasthan = List.of("Jaipur", "Jaiselmer");

}
