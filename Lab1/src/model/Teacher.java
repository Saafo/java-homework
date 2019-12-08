package model;

public class Teacher extends Person {

    private static final long serialVersionUID = 1L;

    private String tid;
    private String title;//职称

    /**
     * @return the tid
     */
    public String getTid() {
        return tid;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param tid the tid to set
     */
    public void setTid(String tid) {
        this.tid = tid;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher(String tid, String name, String sex, int age, String title) {
        super(name, sex, age);
        this.tid = tid;
        this.title = title;
    }
    public String display() {
        return String.format("(Teacher:)tid: %s, name: %s, sex: %s, age: %d, title: %s", tid, name, sex, age, title);
    }
}