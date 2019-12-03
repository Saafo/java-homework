package model;

public class TestSchedule {
    public static void main(String[] args) {
        Schedule schedule = new Schedule("myclassid", "mysid", "mytid", "myclassroom");

        System.out.println(schedule.getClassid());
        System.out.println(schedule.getCid());
        System.out.println(schedule.getTid());
        System.out.println(schedule.getClassroom());

        schedule.setClassid("newclassid");
        schedule.setCid("newcid");
        schedule.setTid("newtid");
        schedule.setClassroom("newclassroom");

        System.out.println(schedule.display());
    }
}