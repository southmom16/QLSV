package school.hethongquanly;

public class EmailSV {
    private String email;
    public EmailSV(){}

    public EmailSV(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void display(){
        System.out.println("The student' email: " + this.email);
    }
}
