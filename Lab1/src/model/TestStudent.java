package model;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("mysid","myname","male", 12, "Software");
        System.out.println("sid: " + student.getSid());
        System.out.println("name: " + student.getName());
        System.out.println("sex: " + student.getSex());
        System.out.println("age: " + student.getAge());
        System.out.println("major: " + student.getMajor());

        student.setSid("newsid");
        student.setName("newname");
        student.setSex("female");
        student.setAge(14);
        student.setMajor("Chinese");
        
        System.out.println(student.display());

    }
}