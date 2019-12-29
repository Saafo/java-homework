public class Person{
    private String name;
    private String address;

    Person(){}
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        return String.format("Person[name=%s,address=%s]", this.name,this.address);
    }
}
class Student extends Person{
    private String program;
    private int year;
    private double fee;
    Student(String name, String address, String program, int year, double fee){
        super();
        setName(name);
        setAddress(address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }
    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }
    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
    public String toString(){
        return String.format("Student[Person[name=%s,address=%s],program=%s,year=%s,fee=%s]",
         this.getName(),this.getAddress(), this.program, this.year, this.fee);
    }
}
class Staff extends Person{
    private String school;
    private double pay;
    Staff(String name,String address,String school,double pay){
        super();
        setName(name);
        setAddress(address);
        this.school = school;
        this.pay = pay;
    }
    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }
    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }
    /**
     * @return the pay
     */
    public double getPay() {
        return pay;
    }
    /**
     * @param pay the pay to set
     */
    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString(){
        return String.format("Staff[Person[name=%s,address=%s],school=%s,pay=%s]",
        this.getName(),this.getAddress(),this.school,this.pay);
    }
}