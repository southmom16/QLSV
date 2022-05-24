package school;

import school.MonHoc;
import school.SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVienTrongNuoc svtn1 = new SinhVienTrongNuoc("123", "Nguyen Van A", "nguyenvana@gmail.com", "Ha Noi", "09854623", 100000);
        SinhVienTrongNuoc svtn2 = new SinhVienTrongNuoc("234", "Nguyen Van B", "nguyenvanb@gmail.com", "Ha Nam", "098549993", 110000);
        SinhVienTrongNuoc svtn3 = new SinhVienTrongNuoc("345", "Nguyen Van C", "nguyenvanc@gmail.com", "Hai Phong", "0985456435", 120000);

        svtn1.show();
        svtn1.add();
        svtn2.show();
        svtn2.add();
        svtn3.show();
        svtn3.add();

        SinhVienNuocNgoai svnn1 = new SinhVienNuocNgoai("America", "999", "John", "john@gmail.com", "Canifornia", "09854623", 100000);
        SinhVienNuocNgoai svnn2 = new SinhVienNuocNgoai("Campuchia", "999", "Abc", "abc@gmail.com", "BCD", "09854623", 100000);
        SinhVienNuocNgoai svnn3 = new SinhVienNuocNgoai("Lao", "999", "Bcd", "bcd@gmail.com", "ABC", "09854623", 100000);

        svnn1.show();
        svnn1.add();
        svnn2.show();
        svnn2.add();
        svnn3.show();
        svnn3.add();


        System.out.println("Enter student name: ");
//        SinhVienImple sv = new SinhVienImple();

        Scanner sc = new Scanner(System.in);
        String tensv = sc.nextLine();
        if(tensv.equals(svtn1.getName()) || tensv.equals(svtn2.getName()) || tensv.equals(svtn3.getName())) {
            SinhVien sv1 = new SinhVienTrongNuoc();
            sv1.student_type();
        } else if (tensv.equals(svnn1.getName()) || tensv.equals(svnn2.getName()) || tensv.equals(svnn3.getName())) {
            SinhVien sv2 = new SinhVienNuocNgoai();
            sv2.student_type();
        }

        GiaoVien gv1 = new GiaoVien("1232", "Nguyen Van D", "nguyenvand@gmail.com", "Ha Noi", "09554623", "Math");
        GiaoVien gv2 = new GiaoVien("234", "Nguyen Van E", "nguyenvane@gmail.com", "Ha Nam", "098949993", "Computer Network");
        GiaoVien gv3 = new GiaoVien("345", "Nguyen Van F", "nguyenvanf@gmail.com", "Hai Phong", "0975456435", "Big Data");

        gv1.show();
        gv1.add();
        gv2.show();
        gv2.add();
        gv3.show();
        gv3.add();


        MonHoc[] monhocs = new MonHoc[100];
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
        public static MonHoc getMonHocInfo(){
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


