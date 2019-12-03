package model;

import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.io.IOException;

public class Program {
    Myfile myfile2 = new Myfile("student.data");
    Myfile myfile3 = new Myfile("teacher.data");
    Myfile myfile4 = new Myfile("course.data");
    Myfile myfile5 = new Myfile("schedule.data");
    Myfile myfile6 = new Myfile("electivecourse.data");
    Student[] StudentList;
    Teacher[] TeacherList;
    Course[] CourseList;
    Schedule[] ScheduleList;
    Electivecourse[] ElectivecourseList;

    public Program() throws IOException {
    }

    public void write5Files(boolean gui) throws IOException {
        try {
            Myfile myfile2 = new Myfile("student.data");
            Student s1 = new Student("sid1","stu1","male", 15,"major");
            Student s2 = new Student("sid2","stu2", "female", 14,"mmajor");
            Student s3 = new Student("sid3","stu3", "universal", 18,"ajor");
            Student s4 = new Student("sid4","stu4", "universal", 18,"ajor");
            Student s5 = new Student("sid5","stu5", "universal", 18,"ajor");
            myfile2.writeFile(s1);
            myfile2.writeFile(s2);
            myfile2.writeFile(s3);
            myfile2.writeFile(s4);
            myfile2.writeFile(s5);

            Myfile myfile3 = new Myfile("teacher.data");
            Teacher t1 = new Teacher("tid1","teacher1", "male", 15,"title1");
            Teacher t2 = new Teacher("tid2","teacher2", "female", 14,"title2");
            Teacher t3 = new Teacher("tid3","teacher3", "universal", 18,"title3");
            Teacher t4 = new Teacher("tid4","teacher4", "universal", 18,"title4");
            Teacher t5 = new Teacher("tid5","teacher5", "universal", 18,"title5");
            myfile3.writeFile(t1);
            myfile3.writeFile(t2);
            myfile3.writeFile(t3);
            myfile3.writeFile(t4);
            myfile3.writeFile(t5);

            Myfile myfile4 = new Myfile("course.data");
            Course c1 = new Course("cid1", "cname1", 32);
            Course c2 = new Course("cid2", "cnama2", 64);
            Course c3 = new Course("cid3", "cname3", 48);
            Course c4 = new Course("cid4", "cname4", 48);
            Course c5 = new Course("cid5", "cname5", 48);
            myfile4.writeFile(c1);
            myfile4.writeFile(c2);
            myfile4.writeFile(c3);
            myfile4.writeFile(c4);
            myfile4.writeFile(c5);

            Myfile myfile5 = new Myfile("schedule.data");
            Schedule sc1 = new Schedule("classid1", "cid1", "tid1","classroom1");
            Schedule sc2 = new Schedule("classid2", "cid2", "tid2","classroom2");
            Schedule sc3 = new Schedule("classid3", "cid3", "tid3","classroom3");
            Schedule sc4 = new Schedule("classid4", "cid4", "tid4","classroom4");
            Schedule sc5 = new Schedule("classid5", "cid5", "tid5","classroom5");
            myfile5.writeFile(sc1);
            myfile5.writeFile(sc2);
            myfile5.writeFile(sc3);
            myfile5.writeFile(sc4);
            myfile5.writeFile(sc5);

            Myfile myfile6 = new Myfile("electivecourse.data");
            Electivecourse e1 = new Electivecourse("elid1", "sid1", "classid1");
            Electivecourse e2 = new Electivecourse("elid2", "sid1", "classid2");
            Electivecourse e3 = new Electivecourse("elid3", "sid3", "classid3");
            Electivecourse e4 = new Electivecourse("elid4", "sid4", "classid4");
            Electivecourse e5 = new Electivecourse("elid5", "sid5", "classid5");
            myfile6.writeFile(e1);
            myfile6.writeFile(e2);
            myfile6.writeFile(e3);
            myfile6.writeFile(e4);
            myfile6.writeFile(e5);
            if(gui) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("Wrote 5 files success!");
                alert.show();
            }else {
                System.out.println("Wrote 5 files success!");
            }
        } catch (IOException e) {
            if(gui) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Writing Files Failed!");
                alert.show();
            }else {
                System.out.println("Writing Files Failed!");
                e.printStackTrace();
            }
        }
    }

    public void read5Files(boolean gui) throws Exception {
        int arraylength = 5;

        try {
            StudentList = new Student[arraylength];
            myfile2.readFile(StudentList);
//            for (Student student : StudentList) {
//                if(student != null) {
//                    System.out.println(student.display());
//                }
//                else {
//                    break;
//                }
//            }

            TeacherList = new Teacher[arraylength];
            myfile3.readFile(TeacherList);
//            for (Teacher teacher : TeacherList) {
//                if(teacher != null) {
//                    System.out.println(teacher.display());
//                }
//                else {
//                    break;
//                }
//            }

            CourseList = new Course[arraylength];
            myfile4.readFile(CourseList);
//            for (Course course : CourseList) {
//                if(course != null) {
//                    System.out.println(course.display());
//                }
//                else {
//                    break;
//                }
//            }

            ScheduleList = new Schedule[arraylength];
            myfile5.readFile(ScheduleList);
//            for (Schedule schedule : ScheduleList) {
//                if(schedule != null) {
//                    System.out.println(schedule.display());
//                }
//                else {
//                    break;
//                }
//            }

            ElectivecourseList = new Electivecourse[arraylength];
            myfile6.readFile(ElectivecourseList);
//            for (Electivecourse electivecourse : ElectivecourseList) {
//                if(electivecourse != null) {
//                    System.out.println(electivecourse.display());
//                }
//                else {
//                    break;
//                }
//            }
            if(gui) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("Read 5 files success!");
                alert.show();
            }else {
                System.out.println("Read 5 files success!");
            }
        } catch (IOException e) {
            if(gui) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Reading Files Failed!");
                alert.show();
            }else {
                System.out.println("Reading Files Failed!");
                e.printStackTrace();
            }
        }
    }

    public void SearchInfoBySid(String sid, boolean gui, ObservableList<TableContent> data) {
        Electivecourse[] ElectRecord = new Electivecourse[5];
        Schedule[] ScheRecord = new Schedule[5];
        Course[] CourRecord = new Course[5];
        Teacher[] TeachRecord = new Teacher[5];
        Student student = null;

        for (Student stu ://学生信息
                StudentList) {
            if(stu.getSid().equals(sid)) {
                student = stu;
            }
        }
        if(student == null) {
            if(gui) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("The student doesn't exist!");
                alert.show();
            }else {
                System.out.println("The student doesn't exist!");
            }
            return;
        }

        int i = 0;
        for (Electivecourse ele://从Elect中选出该学生所有选课记录
             ElectivecourseList) {
            if(ele.getSid().equals(sid)) {
                ElectRecord[i++] = ele;
            }
        }
        i = 0;
        for (Electivecourse ele://用ElectList的classid值选出所有符合条件的schedule
            ElectRecord) {
            if(ele != null) {
                for (Schedule sch:
                     ScheduleList) {
                    if(ele.getClassid().equals(sch.getClassid())) {
                        ScheRecord[i++] = sch;
                    }
                }
            }else{
                break;
            }
        }
        i = 0;
        for (Schedule sch://用schedule的cid值选出所有符合条件的course
                ScheRecord) {
            if(sch != null) {
                for (Course cou:
                        CourseList) {
                    if(sch.getCid().equals(cou.getCid())) {
                        CourRecord[i++] = cou;
                    }
                }
            }else{
                break;
            }
        }
        i = 0;
        for (Schedule sch://用schedule的tid值选出所有符合条件的teacher
                ScheRecord) {
            if(sch != null) {
                for (Teacher teach:
                        TeacherList) {
                    if(sch.getTid().equals(teach.getTid())) {
                        TeachRecord[i++] = teach;
                    }
                }
            }else{
                break;
            }
        }
        //信息输出部分
        if(gui) {
            for (i = 0; i < 5; i++) {
                if (ElectRecord[i] != null && ScheRecord[i] != null
                && CourRecord[i] != null && TeachRecord[i] != null) {
                    data.add(new TableContent(CourRecord[i].getCname(),TeachRecord[i].getName(),ScheRecord[i].getClassroom()));
                }else {
                    break;
                }
            }

        }else {
            System.out.println(student.display());
            for (i = 0; i < 5; i++) {
                if (ElectRecord[i] != null && ScheRecord[i] != null
                        && CourRecord[i] != null && TeachRecord[i] != null) {
                    System.out.println("Record " + (i + 1)+": Course Name: "+CourRecord[i].getCname()+" Teacher Name: "
                            + TeachRecord[i].getName() + " Classroom: " + ScheRecord[i].getClassroom());
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Program program = new Program();
        program.write5Files(false);
        program.read5Files(false);
        program.SearchInfoBySid("sid1",false,null);
    }
}
