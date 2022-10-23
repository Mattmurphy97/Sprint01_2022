public class Person {
    private String name;
    private String phoneNum;
    private String email;

    public Person(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Name: " + name + ". \n" + "Phone#: " + phoneNum + ". \n" + "Email: " + email;
    }
}