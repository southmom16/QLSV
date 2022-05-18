package school;

public abstract class AbstractMonHoc{
    protected String id_subject;
    protected String name_subject;
    protected int period;
    protected int credit;
    protected int test;
    protected String teacher;


    public abstract void setId_subject(String id_subject);
    public abstract String getId_subject();
    public abstract void setName_subject(String name_subject);
    public abstract String getName_subject();
    public abstract void setPeriod(int period);
    public abstract int getPeriod();
    public abstract void setCredit(int credit);
    public abstract int getCredit();
    public abstract void setTest(int test);
    public abstract int getTest();
    public abstract void setTeacher(String teacher);
    public abstract String getTeacher();
    public abstract String toString();
    public abstract void add();
    public abstract void edit(String name);
    public abstract void del(String name);
}

