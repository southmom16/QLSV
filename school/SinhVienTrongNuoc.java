package school;

public class SinhVienTrongNuoc extends SinhVien{
    private final String nationality = "Viet Nam";

    public SinhVienTrongNuoc(){}
    public SinhVienTrongNuoc(String id, String name, String email, String address, String phone_number, float payfee){
        super(id, name, email, address, phone_number, payfee);
    }
    public String getNationality(){
        return nationality;
    }

    public void show(){
        System.out.println("SinhVien{" + "nationality= " + nationality + ", id= " + id + ", name= " + name + ", address= " + address + ", email= " + email + ", phone number= " + phone_number + ", pay fee = " + payfee + "}");
    }

    @Override
    public void add(){
        System.out.println("Add native student successfully");
    }
    @Override
    public void edit(String name){
        System.out.println("Delete native student successfully");
    }
    @Override
    public void del(String name){
        System.out.println("Edit native student successfully");
    }

}
