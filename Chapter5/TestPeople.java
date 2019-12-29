public class TestPeople {
    public static void main(String[] args){
        Person per = new Person("n1","a1");
        System.out.println("PersonName:"+per.getName());
        System.out.println("PersonAddr:"+per.getAddress());
        per.setName("n2");
        per.setAddress("a2");
        System.out.println("PersonName:"+per.getName());
        System.out.println("PersonAddr:"+per.getAddress());
        System.out.println(per.toString());
        System.out.println("------------------");
        Student stu = new Student("sn1","sa1","sp1",1,100.0);
        System.out.println("StuName:"+stu.getName());
        System.out.println("StuAddr:"+stu.getAddress());
        stu.setName("sn2");
        stu.setAddress("sa2");
        stu.setProgram("sp2");
        stu.setYear(2);
        stu.setFee(200.0);
        System.out.println(stu.toString());
        System.out.println("------------------");
        Staff sta = new Staff("fn1","fa1","fs1",1000.0);
        System.out.println("StaName:"+sta.getName());
        System.out.println("StaAddr:"+sta.getAddress());
        sta.setSchool("fs2");
        sta.setPay(2000.0);
        System.out.println(sta.toString());
    }

}