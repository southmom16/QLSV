package school.person;

public class SinhVienNuocNgoai extends SinhVien{
    private String nationality;

    public SinhVienNuocNgoai(){}
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

    @Override
    public void showInformation(){
        System.out.println(getPosition() + "{" + "nationality= " + nationality + ", id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhoneNumber() + ", pay fee = " + getPayfee() + "}");
    }


}
