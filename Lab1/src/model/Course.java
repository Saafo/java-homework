package model;

import java.io.Serializable;

public class Course implements Serializable {
    private String cname;
    private String cid;
    private int chour;

    /**
     * @return the chour
     */
    public int getChour() {
        return chour;
    }
    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }
    /**
     * @return the cname
     */
    public String getCname() {
        return cname;
    }
    /**
     * @param chour the chour to set
     */
    public void setChour(int chour) {
        this.chour = chour;
    }
    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }
    /**
     * @param cname the cname to set
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    public Course(String cid, String cname, int chour) {
        this.cid = cid;
        this.cname = cname;
        this.chour = chour;
    }
    public String display() {
        return String.format("(Course:)cid: %s, cname: %s, chour: %d", cid, cname, chour);
    }
}