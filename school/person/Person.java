package school.person;

public abstract class Person implements PersonShowInterface{

    public static int munberofPersonn = 0;
    public static final String schoolName = "Thuy Loi University";

    private String id;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String id, String name, String address, String email, String phone_number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phone_number;
        munberofPersonn += 1;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    
}

