package school;

public class GiaoVien extends Person {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone_number;
    private String subject;

    public GiaoVien(){}

    public GiaoVien(String id, String name, String email, String address, String phone_number, String subject){
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone_number = phone_number;
        this.subject = subject;
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
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    @Override
    public void show() {
        System.out.println("GiaoVien{ id= " + id + ", name= " + name + ", address= " + address + ", email= " + email + ", phone number= " + phone_number + ", subject= " + subject + "}");
    }
    @Override
    public void add() {
        System.out.println("Add teacher successfully");
    }
    @Override
    public void edit(String name) {
        System.out.println("Edit teacher successfully");
    }
    @Override
    public void del(String name) {
        System.out.println("Delete teacher successfully");
    }
}
