package school.monhoc;

public class MonHoc{
    private String id_subject;
    private String name_subject;
    private int period;
    private int credit;
    private int test;
    private String teacher;
    public MonHoc(String id_subject, String name_subject, int period, int credit, int test, String teacher){
        this.id_subject = id_subject;
        this.name_subject = name_subject;
        this.period = period;
        this.credit = credit;
        this.test = test;
        this.teacher = teacher;
    }

    public void setId_subject(String id_subject){
        this.id_subject = id_subject;
    }
    public String getId_subject(){
        return id_subject;
    }
    public void setName_subject(String name_subject){
        this.name_subject = name_subject;
    }
    public String getName_subject(){
        return name_subject;
    }
    public void setPeriod(int period){
        this.period = period;
    }
    public int getPeriod(){
        return period;
    }
    public void setCredit(int credit){
        this.credit = credit;
    }
    public int getCredit(){
        return credit;
    }
    public void setTest(int test){
        this.test = test;
    }
    public int getTest() {
        return test;
    }
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    public String getTeacher(){
        return teacher;
    }
    public String toString(){
        return "Monhoc{" + "id= " + id_subject + ", name= " + name_subject + ", period= " + period + ", credit= " + credit + ", test= " + test + ", teacher= " + teacher + "}";
    }
    public void add(){
        System.out.println("Add subject successfully");
    }
    public void edit(String name){
        System.out.println("Delete subject successfully");
    }
    public void del(String name){
        System.out.println("Edit subject successfully");
    }
}

