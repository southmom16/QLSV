package school;

import school.MonHoc;
import school.SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien svtn1 = new SinhVienTrongNuoc("123", "Nguyen Van A", "nguyenvana@gmail.com", "Ha Noi", "09854623", 100000);
        SinhVien svtn2 = new SinhVienTrongNuoc("234", "Nguyen Van B", "nguyenvanb@gmail.com", "Ha Nam", "098549993", 110000);
        SinhVien svtn3 = new SinhVienTrongNuoc("345", "Nguyen Van C", "nguyenvanc@gmail.com", "Hai Phong", "0985456435", 120000);


        svtn1.show();
        svtn1.add();
        svtn2.show();
        svtn2.add();
        svtn3.show();
        svtn3.add();


        SinhVien svnn1 = new SinhVienNuocNgoai("America", "999", "John", "john@gmail.com", "Canifornia", "09854623", 100000);
        SinhVien svnn2 = new SinhVienNuocNgoai("Campuchia", "999", "Abc", "abc@gmail.com", "BCD", "09854623", 100000);
        SinhVien svnn3 = new SinhVienNuocNgoai("Lao", "999", "Bcd", "bcd@gmail.com", "ABC", "09854623", 100000);

        svnn1.show();
        svnn1.add();
        svnn2.show();
        svnn2.add();
        svnn3.show();
        svnn3.add();

        AbstractMonHoc[] monhocs = new MonHoc[100];
        int n;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("number subject: ");
        n = sc1.nextInt();
        for (int i = 0; i < n; i++) {
            monhocs[i] = getMonHocInfo();
            monhocs[i].add();
            System.out.println(monhocs[i]);
        }
    }
        public static AbstractMonHoc getMonHocInfo(){
            MonHoc m = null;

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

            m = new MonHoc(id_subject, name_subject, period, credit, test, teacher);

            return m;
        }

    }

//        SinhVien[] sinhviens = new SinhVien[100];
//        Monhoc[] monhocs = new Monhoc[100];
//        int n,m;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("number student: ");
//        n = sc.nextInt();
//        for(int i=0; i < n; i++) {
//            sinhviens[i] = getSinhVienInfo();
//            sinhviens[i].add();
//            System.out.println(sinhviens[i]);
//            Scanner sc1 = new Scanner(System.in);
//            System.out.println("number subject: ");
//            m = sc1.nextInt();
//            for(int j=0;j<m;j++){
//                monhocs[j] = getMonHocInfo();
//                monhocs[i].add();
//                System.out.println(monhocs[j]);
//            }
//        }
////        System.out.println("===============");
////        for(int i=0; i < n; i++) {
////            System.out.println(sinhviens[i]);
////            for(int j=0;j < m;j++){
////                monhocs[j] = getMonHocInfo();
////                System.out.println(monhocs[j]);
////            }
////        }
////        System.out.println("===============================");
//
//    }
//    public static SinhVien getSinhVienInfo(){
//        SinhVien s = null;
//        String id, name, address, email, phone_number;
//        float payfee;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ID: ");
//        id = sc.nextLine();
//        System.out.println("Name: ");
//        name = sc.nextLine();
//        System.out.println("Address: ");
//        address = sc.nextLine();
//        System.out.println("Email: ");
//        email = sc.nextLine();
//        System.out.println("Phone number: ");
//        phone_number = sc.nextLine();
//        System.out.println("Pay fee: ");
//        payfee = sc.nextFloat();
//
//
//        s = new SinhVien(id, name, address, email, phone_number, payfee);
//
//        return s;
//    }
//

