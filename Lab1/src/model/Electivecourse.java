package model;

import java.io.Serializable;

public class Electivecourse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String elid;
    private String sid;
    private String classid;

    /**
     * @return the classid
     */
    public String getClassid() {
        return classid;
    }
    /**
     * @return the elid
     */
    public String getElid() {
        return elid;
    }
    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }
    /**
     * @param classid the classid to set
     */
    public void setClassid(String classid) {
        this.classid = classid;
    }
    /**
     * @param elid the elid to set
     */
    public void setElid(String elid) {
        this.elid = elid;
    }
    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    public Electivecourse(String elid, String sid, String classid) {
        this.elid = elid;
        this.sid = sid;
        this.classid = classid;
    }
    public String display() {
        return String.format("(Electivecourse:)elid: %s, sid: %s, classid: %s", elid, sid, classid);
    }
}