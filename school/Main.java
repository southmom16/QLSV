package school;

import school.Monhoc;
import school.SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien[] sinhviens = new SinhVien[100];
        Monhoc[] monhocs = new Monhoc[100];
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("number student: ");
        n = sc.nextInt();
        for(int i=0; i < n; i++) {
            sinhviens[i] = getSinhVienInfo();
            sinhviens[i].add();
            System.out.println(sinhviens[i]);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("number subject: ");
            m = sc1.nextInt();
            for(int j=0;j<m;j++){
                monhocs[j] = getMonHocInfo();
                monhocs[i].add();
                System.out.println(monhocs[j]);
            }
        }
//        System.out.println("===============");
//        for(int i=0; i < n; i++) {
//            System.out.println(sinhviens[i]);
//            for(int j=0;j < m;j++){
//                monhocs[j] = getMonHocInfo();
//                System.out.println(monhocs[j]);
//            }
//        }
//        System.out.println("===============================");
//
//        Monhoc monhocs1 = new Monhoc();
//        monhocs1 = getMonHocInfo();
//        System.out.println(monhocs1);
//        SinhVien sv1 = new SinhVien("dasd","dasd","asds","asdsa","asdsad",321343);
//        System.out.println(sv1);
    }
    public static SinhVien getSinhVienInfo(){
        SinhVien s = null;
        String id, name, address, email, phone_number;
        float payfee;

        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Phone number: ");
        phone_number = sc.nextLine();
        System.out.println("Pay fee: ");
        payfee = sc.nextFloat();


        s = new SinhVien(id, name, address, email, phone_number, payfee);

        return s;
    }

    public static Monhoc getMonHocInfo(){
        Monhoc m = null;

        String id_subject, name_subject, teacher;
        int test, period, credit;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ID subject: ");
        id_subject = sc.nextLine();
        System.out.println("Name subject: ");
        name_subject = sc.nextLine();
        System.out.println("Period: ");
        period = sc.nextInt();
        System.out.println("Credit: ");
        credit = sc.nextInt();
        if( credit>= 1 && credit <=4 ){
        }
        else {
            System.out.println("Again: ");
            credit = sc.nextInt();
        }
        System.out.println("Test: ");
        test = sc.nextInt();
        if( test> 1 && test <5 ){
        }
        else {
            System.out.println("Again: ");
            test = sc.nextInt();
        }
        System.out.println("Teacher: ");
        teacher = sc1.nextLine();

        m = new Monhoc(id_subject, name_subject, period, credit, test, teacher);

        return m;
    }
}
