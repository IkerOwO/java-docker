package models;

import java.time.LocalDate;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private LocalDate birthDate;

    public Person(){}

    public Person(String name, String lastName, int age, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + ", birthDate=" + birthDate + "]";
    }    

    
}
