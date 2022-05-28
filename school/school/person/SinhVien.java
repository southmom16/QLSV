package school.person;

public class SinhVien extends Person implements PersonShowInterface,typeofSV, UpdatePersonInterface{
    private final String POSITION = "Sinh Vien";
    private float payfee;

    public SinhVien(){}
     public SinhVien(String id, String name, String email, String address, String phoneNumber, float payfee){
         super(id, name, address, email, phoneNumber);
         this.payfee = payfee;
     }
    public String getPosition(){return POSITION;}

    public void setPayfee(float payfee){
        this.payfee = payfee;
    }
    public float getPayfee() {
        return payfee;
    }

    @Override
    public void showInformation(){
        System.out.println(POSITION + "{ id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhoneNumber() + ", pay fee = " + payfee + "}");
    }
    @Override
    public String add(){
        return "Add student successfully";
    }
    @Override
    public String edit(String name){
        return "Edit student successfully";
    }
    @Override
    public String del(String name){
        return "Delete foreign student successfully";
    }
    @Override
    public void position() {
        System.out.println("Position: Sinh Vien");
    }
    @Override
    public void typeofStudent() {}
}
