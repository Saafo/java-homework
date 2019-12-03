package model;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("mycid", "myname", 32);
        System.out.println(course.getCid());
        System.out.println(course.getCname());
        System.out.println(course.getChour());

        course.setCid("newsid");
        course.setCname("newcname");
        course.setChour(64);

        System.out.println(course.display());
    }
}