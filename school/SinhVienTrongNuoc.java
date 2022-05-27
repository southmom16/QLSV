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
    public String show(){
        return getPosition() +"{" + "nationality= " + nationality + ", id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhoneNumber() + ", pay fee = " + getPayfee() + "}";
    }
    @Override
    public void typeofStudent(){
        System.out.println("Native student");
    }
    @Override
    public String add(){
        return "Add native student successfully";
    }
    @Override
    public String edit(String name) {
        return "Delete foreign student successfully";
    }
    @Override
    public String del(String name) {
        return "Edit foreign student successfully";
    }
}
