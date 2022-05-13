package school;

public class SinhVien {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone_number;
    private float payfee;

    public SinhVien(){
    }

     public SinhVien(String id, String name, String email, String address, String phone_number, float payfee){
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone_number = phone_number;
        this.payfee = payfee;
     }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public void setPayfee(float payfee){
        this.payfee = payfee;
    }
    public float getPayfee() {
        return payfee;
    }

    @Override
    public String toString(){
        return "SinhVien{" + "id= " + id + ", name= " + name + ", address= " + address + ", email= " + email + ", phone number= " + phone_number + ", pay fee = " + payfee + "}";
    }

    public void add(){
        System.out.println("Add successfully");
    }
    public void edit(String name){
        System.out.println("Delete successfully");
    }
    public void del(String name){
        System.out.println("Edit successfully");
    }
}
