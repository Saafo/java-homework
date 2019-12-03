package model;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected String name;
    protected String sex;
    protected int age;

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String display() {
        return String.format("(Person:)name: %s, sex: %s, age: %d", name, sex, age);
    }
}