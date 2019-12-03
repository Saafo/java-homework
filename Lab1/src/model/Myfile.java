package model;

import java.io.*;

public class Myfile {
    private File opfile;

    public File getOpFile() {
        return opfile;
    }
//    public void readFile(){};
//    public void writeFile(){};

    Myfile(String FileName) throws IOException {
        this.opfile = new File(FileName); //File opfile = new File(FileName);
        if (opfile.exists()) {
            opfile.delete();
        }
        opfile.createNewFile();
        if (!opfile.canRead()) {
            System.out.println("file cannot be read. Please check authority.");
        }
    }


    public void writeFile(Person person) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {//try with resources
            os.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writeFile(Student student) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {//try with resources
            os.writeObject(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writeFile(Teacher teacher) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {//try with resources
            os.writeObject(teacher);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writeFile(Course course) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {//try with resources
            os.writeObject(course);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writeFile(Schedule schedule) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {//try with resources
            os.writeObject(schedule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writeFile(Electivecourse electivecourse) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.opfile,true))) {//try with resources
            os.writeObject(electivecourse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void readFile(Person[] PersonList) throws Exception {
        try {
            FileInputStream in = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            int i = 0;
            while(in.available() > 0) {
                ois = new ObjectInputStream(in);
                PersonList[i++] = (Person)ois.readObject();
            }
            ois.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void readFile(Student[] StudentList) throws Exception {
        try {
            FileInputStream in = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            int i = 0;
            while(in.available() > 0) {
                ois = new ObjectInputStream(in);
                StudentList[i++] = (Student)ois.readObject();
            }
            ois.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void readFile(Teacher[] TeacherList) throws Exception {
        try {
            FileInputStream in = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            int i = 0;
            while(in.available() > 0) {
                ois = new ObjectInputStream(in);
                TeacherList[i++] = (Teacher)ois.readObject();
            }
            ois.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void readFile(Course[] CourseList) throws Exception {
        try {
            FileInputStream in = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            int i = 0;
            while(in.available() > 0) {
                ois = new ObjectInputStream(in);
                CourseList[i++] = (Course)ois.readObject();
            }
            ois.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void readFile(Schedule[] ScheduleList) throws Exception {
        try {
            FileInputStream in = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            int i = 0;
            while(in.available() > 0) {
                ois = new ObjectInputStream(in);
                ScheduleList[i++] = (Schedule)ois.readObject();
            }
            ois.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void readFile(Electivecourse[] ElectivecourseList) throws Exception {
        try {
            FileInputStream in = new FileInputStream(this.opfile);
            ObjectInputStream ois = null;
            int i = 0;
            while(in.available() > 0) {
                ois = new ObjectInputStream(in);
                ElectivecourseList[i++] = (Electivecourse)ois.readObject();
            }
            ois.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}