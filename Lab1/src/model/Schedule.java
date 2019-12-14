package model;

import java.io.Serializable;

public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    private String classid;
    private String cid;
    private String tid;
    private String classroom;

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }
    /**
     * @return the classid
     */
    public String getClassid() {
        return classid;
    }
    /**
     * @return the classroom
     */
    public String getClassroom() {
        return classroom;
    }
    /**
     * @return the tid
     */
    public String getTid() {
        return tid;
    }
    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }
    /**
     * @param classid the classid to set
     */
    public void setClassid(String classid) {
        this.classid = classid;
    }
    /**
     * @param classroom the classroom to set
     */
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    /**
     * @param tid the tid to set
     */
    public void setTid(String tid) {
        this.tid = tid;
    }
    
    public Schedule(String classid, String cid, String tid, String classroom) {
        this.classid = classid;
        this.cid = cid;
        this.tid = tid;
        this.classroom = classroom;
    }
    public String display() {
        return String.format("(Schedule:)classid: %s, cid: %s, tid: %s, classroom: %s", classid, cid, tid, classroom);
    }
}