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

    @Override
    public void show(){
        System.out.println("SinhVien{" + "nationality= " + nationality + ", id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhone_number() + ", pay fee = " + getPayfee() + "}");
    }
    @Override
    public void student_type(){
        System.out.println("Native student");
    }
    @Override
    public void add(){
        System.out.println("Add native student successfully");
    }
    @Override
    public void edit(String name) {
        System.out.println("Delete foreign student successfully");
    }
    @Override
    public void del(String name) {
        System.out.println("Edit foreign student successfully");
    }
}
