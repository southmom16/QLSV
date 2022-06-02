package school.person;

public class SinhVien extends Person{
    private final String POSITION = "Sinh Vien";
    private float payfee;

    public SinhVien() {
    }

    public SinhVien(String id, String name, String email, String address, String phoneNumber, float payfee) {
        super(id, name, address, email, phoneNumber);
        this.payfee = payfee;
    }

    public String getPosition() {
        return POSITION;
    }

    public void setPayfee(float payfee) {
        this.payfee = payfee;
    }

    public float getPayfee() {
        return payfee;
    }

    @Override
    public void showInformation() {
        System.out.println(POSITION + "{ id= " + getId() + ", name= " + getName() + ", address= " + getAddress() + ", email= " + getEmail() + ", phone number= " + getPhoneNumber() + ", pay fee = " + payfee + ", school name: " + schoolName +"}");
    }
}