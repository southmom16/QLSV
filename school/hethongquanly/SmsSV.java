package school.hethongquanly;

public class SmsSV {
    private String phoneNumber;
    public SmsSV(){}

    public SmsSV(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return phoneNumber;
    }

    public void setEmail(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void display(){
        System.out.println("The student' phone number: " + this.phoneNumber);
    }
}
