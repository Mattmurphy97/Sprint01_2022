package com.keyin.sprint;

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
        return name.toLowerCase();
    }

    public String getPhone() {
        return phoneNum;
    }

    public String getEmail() {
        return email.toLowerCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\nName: " + getName().toLowerCase() + "\nPhone #: " + getPhone() + "\nEmail: "
                + getEmail().toLowerCase();
    }
}
