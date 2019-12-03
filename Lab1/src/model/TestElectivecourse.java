package model;

public class TestElectivecourse {
    public static void main(String[] args) {
        Electivecourse electivecourse =
        new Electivecourse("myelid","mysid", "myclassid");

        System.out.println(electivecourse.getElid());
        System.out.println(electivecourse.getSid());
        System.out.println(electivecourse.getClassid());

        electivecourse.setElid("newelid");
        electivecourse.setSid("newsid");
        electivecourse.setClassid("newclassid");

        System.out.println(electivecourse.display());
    }
}