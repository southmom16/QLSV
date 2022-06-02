package school.person;

public class SinhVienTrongNuoc extends SinhVien{
    private final String NATIONALITY = "Viet Nam";

    public SinhVienTrongNuoc(){}
    public SinhVienTrongNuoc(String id, String name, String email, String address, String phone_number, float payfee){
        super(id, name, email, address, phone_number, payfee);
    }
    public String getNationality(){
        return NATIONALITY;
    }

    @Override
    public void showInformation(){
        System.out.println(getPosition() +"{" + "nationality= " + NATIONALITY + ", id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhoneNumber() + ", pay fee = " + getPayfee() + ", school: " + schoolName + "}");
    }
}
