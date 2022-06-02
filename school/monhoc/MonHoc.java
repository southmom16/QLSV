package school.monhoc;

import java.util.ArrayList;
import java.util.Scanner;

public class MonHoc{
    private String id_subject;
    private String name_subject;
    private int period;
    private int credit;
    private String teacher;
    public MonHoc(String id_subject, String name_subject, int period, int credit, String teacher){
        this.id_subject = id_subject;
        this.name_subject = name_subject;
        this.period = period;
        this.credit = credit;
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
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    public String getTeacher(){
        return teacher;
    }


    public String toString(){
        return "Monhoc{" + "id= " + id_subject + ", name= " + name_subject + ", period= " + period + ", credit= " + credit + ", test= " + ", teacher= " + teacher + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MonHoc) {
            MonHoc mon = (MonHoc) obj;
            if (this.id_subject.equals(mon.id_subject)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 1 + id_subject.hashCode();
    }
}