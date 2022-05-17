package school;

public class SinhVienNuocNgoai extends SinhVien{
    private String nationality;


    public SinhVienNuocNgoai(String nationality, String id, String name, String email, String address, String phone_number, float payfee){
        super(id, name, email, address, phone_number, payfee);
        this.nationality = nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public String getNationality(){
        return nationality;
    }

    public void show(){
        System.out.println("SinhVien{" + "nationality= " + nationality + ", id= " + id + ", name= " + name + ", address= " + address + ", email= " + email + ", phone number= " + phone_number + ", pay fee = " + payfee + "}");
    }

    public void add(){
        System.out.println("Add student successfully");
    }
    public void edit(String name){
        System.out.println("Delete student successfully");
    }
    public void del(String name){
        System.out.println("Edit student successfully");
    }
}
