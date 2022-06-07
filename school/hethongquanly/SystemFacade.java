package school.hethongquanly;

import java.util.Scanner;

public class SystemFacade {
    AccountSV accountSV;
    PaymentFees ebankingAccount;
    EmailSV emailSV;
    SmsSV phoneNumber;

    public SystemFacade() {
    }

    public SystemFacade(AccountSV accountSV, PaymentFees paymentFees, EmailSV emailSV, SmsSV phoneNumber) {
        this.accountSV = accountSV;
        this.ebankingAccount = paymentFees;
        this.emailSV = emailSV;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountSV(AccountSV accountSV) {
        this.accountSV = accountSV;
    }

    public AccountSV getAccountSV() {
        return accountSV;
    }

    public void setPaymentFees(PaymentFees ebankingAccount) {
        this.ebankingAccount = ebankingAccount;
    }

    public PaymentFees getPaymentFees() {
        return ebankingAccount;
    }

    public void setEmailSV(EmailSV emailSV) {
        this.emailSV = emailSV;
    }

    public EmailSV getEmailSV() {
        return emailSV;
    }

    public void setSmsSV(SmsSV phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SmsSV getSmsSV() {
        return phoneNumber;
    }

    public void display() {
        this.accountSV.display();
        this.ebankingAccount.display();
        this.emailSV.display();
        this.phoneNumber.display();
        System.out.println("-------------------------------------------");
    }

    public void setInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student' account: ");
        String accountSV = scanner.nextLine();
        System.out.print("Enter student' E-Banking Account : ");
        String ebankingAccount = scanner.nextLine();
        System.out.print("Enter student' email: ");
        String emailSV = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        this.accountSV = new AccountSV(accountSV);
        this.ebankingAccount = new PaymentFees(ebankingAccount);
        this.emailSV = new EmailSV(emailSV);
        this.phoneNumber = new SmsSV(phoneNumber);

    }
}
