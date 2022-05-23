package school;

public abstract class SinhVien implements IShow, IStudent_type, IAdd, IEdit, IDel{
    protected String id;
    protected String name;
    protected String address;
    protected String email;
    protected String phone_number;
    protected float payfee;

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

    public abstract void show();
    public abstract void student_type();
    public abstract void add();
    public abstract void edit(String name);
    public abstract void del(String name);
}
