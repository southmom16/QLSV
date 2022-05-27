package school;

public class GiaoVien extends Person implements PersonShowInterface, UpdatePersonInterface {
    private final String position = "Giao Vien";
    private String subject;
    public GiaoVien(){}
    public GiaoVien(String id, String name, String email, String address, String phoneNumber, String subject){
        super(id, name, address, email, phoneNumber);
        this.subject = subject;
    }
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public String getPosition(){return position;}
    @Override
    public String show() {
        return position + "{ id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhoneNumber() + ", subject= " + subject + "}";
    }
    @Override
    public String add() {
        return "Add teacher successfully";
    }
    @Override
    public String edit(String name) {
        return "Edit teacher successfully";
    }
    @Override
    public String del(String name) {
        return "Delete teacher successfully";
    }
    @Override
    public void position() {
        System.out.println("Position: Giao Vien");
    }
}
