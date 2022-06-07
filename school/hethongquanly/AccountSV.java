package school.hethongquanly;

public class AccountSV {

    private String account;

    public AccountSV(){}

    public AccountSV(String account){
        this.account = account;
    }

    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public void display(){
        System.out.println("The student' account: " + this.account);
    }

}
