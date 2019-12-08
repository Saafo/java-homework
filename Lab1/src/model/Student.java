package model;

public class Student extends Person {

    private static final long serialVersionUID = 1L;

    private String sid;
    private String major;
    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }
    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }
    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }
    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    public Student(String sid, String name, String sex,
                   int age, String major) {
        super(name,sex,age);
        this.sid = sid;
        this.major = major;
    }
    public String display() {
        return String.format("(Student:)sid: %s, name: %s, sex: %s, age: %d, major: %s", sid,name,sex,age,major);
    }
}