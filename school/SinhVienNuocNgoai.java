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
    public void show(){
        System.out.println("SinhVien{" + "nationality= " + nationality + ", id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhone_number() + ", pay fee = " + getPayfee() + "}");
    }

    @Override
    public void student_type(){
        System.out.println("Foreign student");
    }
    @Override
    public void add(){
        System.out.println("Add foreign student successfully");
    }
    @Override
    public void edit(String name){
        System.out.println("Edit foreign student successfully");
    }
    @Override
    public void del(String name){
        System.out.println("Delete foreign student successfully");
    }

}
