package model;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("myname","male", 12);
        System.out.println("name: " + person.getName());
        System.out.println("sex: " + person.getSex());
        System.out.println("age: " + person.getAge());

        person.setSex("female");
        person.setName("newname");
        person.setAge(14);
        
        System.out.println(person.display());

    }
}