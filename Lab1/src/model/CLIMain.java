package model;

import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.util.Scanner;

public class CLIMain {
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

    public CLIMain() throws IOException {
    }

    public void write5Files(boolean gui, int guidatatype, String guidata) throws IOException {
        try {
            int t = 0;
            String p1 = null,p2 = null,p3 = null,p4 = null;
            int i1 = -1;
            String[] guidatalist;

            if(gui){
                t = guidatatype;
                guidatalist = guidata.split(",");
                switch (guidatatype) {
                    case 1:
                    case 2:
                        p1 = guidatalist[0];
                        p2 = guidatalist[1];
                        p3 = guidatalist[2];
                        i1 = Integer.parseInt(guidatalist[3]);
                        p4 = guidatalist[4];break;
                    case 3:
                        p1 = guidatalist[0];
                        p2 = guidatalist[1];
                        i1 = Integer.parseInt(guidatalist[2]);break;
                    case 4:
                        p1 = guidatalist[0];
                        p2 = guidatalist[1];
                        p3 = guidatalist[2];
                        p4 = guidatalist[3];break;
                    case 5:
                        p1 = guidatalist[0];
                        p2 = guidatalist[1];
                        p3 = guidatalist[2];break;
                }
            }else{
                System.out.printf("Please input the index of the data types:\n1.student\n2.teacher\n3.course\n" +
                        "4.schedule\n5.electivecourse\nYour choice:");
                Scanner input = new Scanner(System.in);
                t = input.nextInt();
                switch (t) {
                    case 1:
                        System.out.println("Please input the sid of the student:");
//                        Scanner input1 = new Scanner(System.in);
                        p1 = input.next();
                        System.out.println("Please input the name of the student:");
                        p2 = input.next();
                        System.out.println("Please input the sex of the student:");
                        p3 = input.next();
                        System.out.println("Please input the age of the student:");
                        i1 = input.nextInt();
                        System.out.println("Please input the major of the student:");
                        p4 = input.next();break;
                    case 2:
                        System.out.println("Please input the tid of the teacher:");
                        p1 = input.next();
                        System.out.println("Please input the name of the teacher:");
                        p2 = input.next();
                        System.out.println("Please input the sex of the teacher:");
                        p3 = input.next();
                        System.out.println("Please input the age of the teacher:");
                        i1 = input.nextInt();
                        System.out.println("Please input the title of the teacher:");
                        p4 = input.next();break;
                    case 3:
                        System.out.println("Please input the cid of the course:");
                        p1 = input.next();
                        System.out.println("Please input the cname of the course:");
                        p2 = input.next();
                        System.out.println("Please input the chour of the course:");
                        i1 = input.nextInt();break;
                    case 4:
                        System.out.println("Please input the classid of the schedule:");
                        p1 = input.next();
                        System.out.println("Please input the cid of the schedule:");
                        p2 = input.next();
                        System.out.println("Please input the tid of the schedule:");
                        p3 = input.next();
                        System.out.println("Please input the classroom of the schedule:");
                        p4 = input.next();break;
                    case 5:
                        System.out.println("Please input the elid of the electivecourse:");
                        p1 = input.next();
                        System.out.println("Please input the sid of the electivecourse:");
                        p2 = input.next();
                        System.out.println("Please input the classid of the electivecourse:");
                        p3 = input.next();break;
                    default:
                        System.out.println("choice invalid!");
                        return;
                }
            }
            switch (t) {
                case 1:
                    Myfile myfile2 = new Myfile("student.data");
                    Student s1 = new Student(p1, p2, p3, i1, p4);
                    myfile2.writeFile(s1);break;
                case 2:
                    Myfile myfile3 = new Myfile("teacher.data");
                    Teacher t1 = new Teacher(p1,p2, p3, i1, p4);
                    myfile3.writeFile(t1);break;
                case 3:
                    Myfile myfile4 = new Myfile("course.data");
                    Course c1 = new Course(p1, p2, i1);
                    myfile4.writeFile(c1);break;
                case 4:
                    Myfile myfile5 = new Myfile("schedule.data");
                    Schedule sc1 = new Schedule(p1, p2, p3, p4);
                    myfile5.writeFile(sc1);break;
                case 5:
                    Myfile myfile6 = new Myfile("electivecourse.data");
                    Electivecourse e1 = new Electivecourse(p1, p2, p3);
                    myfile6.writeFile(e1);break;
                default:
                    System.out.println("choice invalid!");
                    return;

            }
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
        int arraylength = 100;

        try {
            StudentList = new Student[arraylength];
            myfile2.readFile(StudentList);

            TeacherList = new Teacher[arraylength];
            myfile3.readFile(TeacherList);

            CourseList = new Course[arraylength];
            myfile4.readFile(CourseList);

            ScheduleList = new Schedule[arraylength];
            myfile5.readFile(ScheduleList);

            ElectivecourseList = new Electivecourse[arraylength];
            myfile6.readFile(ElectivecourseList);

            if(StudentList != null) {
                if(gui) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information");
                    alert.setHeaderText(null);
                    alert.setContentText("Read 5 files success!");
                    alert.show();
                }else {
                    System.out.println("Read 5 files success!");
                }
            }else {
                if(gui) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setHeaderText(null);
                    alert.setContentText("Had Read Empty Files!");
                    alert.show();
                }else {
                    System.out.println("Had Read Empty Files!");
                }

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
        Electivecourse[] ElectRecord = new Electivecourse[100];
        Schedule[] ScheRecord = new Schedule[100];
        Course[] CourRecord = new Course[100];
        Teacher[] TeachRecord = new Teacher[100];
        Student student = null;

        for (Student stu ://学生信息
                StudentList) {
            if(stu != null) {
                if(stu.getSid().equals(sid)) {
                    student = stu;
                }
            }else {
                break;
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
            if(ele == null) {
                break;
            }else if(ele.getSid().equals(sid)) {
                ElectRecord[i++] = ele;
            }
        }
        i = 0;
        for (Electivecourse ele://用ElectList的classid值选出所有符合条件的schedule
            ElectRecord) {
            if(ele != null) {
                for (Schedule sch:
                     ScheduleList) {
                    if(sch == null) {
                        break;
                    }else if(ele.getClassid().equals(sch.getClassid())) {
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
                    if(cou == null) {
                        break;
                    }else if(sch.getCid().equals(cou.getCid())) {
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
                    if(teach == null) {
                        break;
                    }else if(sch.getTid().equals(teach.getTid())) {
                        TeachRecord[i++] = teach;
                    }
                }
            }else{
                break;
            }
        }
        //信息输出部分
        if(gui) {
            for (i = 0; i < 100; i++) {
                if (ElectRecord[i] != null && ScheRecord[i] != null
                && CourRecord[i] != null && TeachRecord[i] != null) {
                    data.add(new TableContent(CourRecord[i].getCname(),TeachRecord[i].getName(),ScheRecord[i].getClassroom()));
                }else {
                    break;
                }
            }

        }else {
            System.out.println(student.display());
            for (i = 0; i < 100; i++) {
                if (ElectRecord[i] != null && ScheRecord[i] != null
                        && CourRecord[i] != null && TeachRecord[i] != null) {
                    System.out.println("Record " + (i + 1)+": Course Name: "+CourRecord[i].getCname()+" Teacher Name: "
                            + TeachRecord[i].getName() + " Classroom: " + ScheRecord[i].getClassroom());
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        CLIMain climain = new CLIMain();
        while (true) {
            int choice = 0;
            System.out.printf("\n\nWelcome to Course-Schedule Manage System");
            System.out.printf("Please input the index you want:\n1.Write data\n2.Read from exist files\n" +
                    "3.Search Student Course Infomation By Student's sid\nYour Choice:");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            System.out.println("");
            switch (choice) {
                case 1:
                    climain.write5Files(false,0, null);break;
                case 2:
                    climain.read5Files(false);break;
                case 3:
                    if(climain.StudentList != null && climain.TeacherList != null && climain.CourseList != null
                            && climain.ScheduleList != null && climain.ElectivecourseList != null) {
                        climain.SearchInfoBySid("sid1",false,null);                  
                    }else {
                        System.out.println("Please fullfill or read the file first!");
                    }
            }
        }
    }
}
