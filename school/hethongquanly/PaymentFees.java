package school.hethongquanly;

public class PaymentFees {
    private String ebankingAccount;
    public PaymentFees(){}

    public PaymentFees(String ebankingAccount){
        this.ebankingAccount = ebankingAccount;
    }

    public String getEbankingAccount(){
        return ebankingAccount;
    }

    public void setEbankingAccount(String ebankingAccount){
        this.ebankingAccount = ebankingAccount;
    }

    public void display(){
        System.out.println("The student' E-Banking Account: " + this.ebankingAccount);
    }
}
