package school;

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
    public String show(){
        return getPosition() + "{" + "nationality= " + nationality + ", id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhoneNumber() + ", pay fee = " + getPayfee() + "}";
    }

    @Override
    public void typeofStudent(){
        System.out.println("Foreign student");
    }
    @Override
    public String add(){
        return "Add foreign student successfully";
    }
    @Override
    public String edit(String name){
        return "Edit foreign student successfully";
    }
    @Override
    public String del(String name){
        return "Delete foreign student successfully";
    }

}
