package model;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("mytid","myname","male", 28, "mytitle");
        System.out.println("tid: " + teacher.getTid());
        System.out.println("name: " + teacher.getName());
        System.out.println("sex: " + teacher.getSex());
        System.out.println("age: " + teacher.getAge());
        System.out.println("title: " + teacher.getTitle());

        teacher.setTid("newtid");
        teacher.setName("newname");
        teacher.setSex("female");
        teacher.setAge(36);
        teacher.setTitle("newtitle");
        
        System.out.println(teacher.display());

    }
}