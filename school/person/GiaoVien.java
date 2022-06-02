package school.person;

public class GiaoVien extends Person {
    private final String POSITION = "Giao Vien";
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
    public String getPosition(){return POSITION;}
    @Override
    public void showInformation() {
        System.out.println(POSITION + "{ id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhoneNumber() + ", subject= " + subject + ", school: " + schoolName +"}");
    }

}
