package spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person been is created");
    }

    public Person(Pet pet) {
        System.out.println("Person been is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
