package school;

import school.MonHoc;
import school.SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person svtn1 = new SinhVienTrongNuoc("123", "Nguyen Van A", "nguyenvana@gmail.com", "Ha Noi", "09854623", 100000);
        Person svtn2 = new SinhVienTrongNuoc("234", "Nguyen Van B", "nguyenvanb@gmail.com", "Ha Nam", "098549993", 110000);
        Person svtn3 = new SinhVienTrongNuoc("345", "Nguyen Van C", "nguyenvanc@gmail.com", "Hai Phong", "0985456435", 120000);

        System.out.println(svtn1.show());
        System.out.println(svtn2.show());
        System.out.println(svtn3.show());


        Person svnn1 = new SinhVienNuocNgoai("America", "999", "John", "john@gmail.com", "Canifornia", "09854623", 100000);
        Person svnn2 = new SinhVienNuocNgoai("Campuchia", "999", "Abc", "abc@gmail.com", "BCD", "09854623", 100000);
        Person svnn3 = new SinhVienNuocNgoai("Lao", "999", "Bcd", "bcd@gmail.com", "ABC", "09854623", 100000);

        System.out.println(svnn1.show());
        System.out.println(svnn2.show());
        System.out.println(svnn3.show());

        Person gv1 = new GiaoVien("1232", "Nguyen Van D", "nguyenvand@gmail.com", "Ha Noi", "09554623", "Math");
        Person gv2 = new GiaoVien("234", "Nguyen Van E", "nguyenvane@gmail.com", "Ha Nam", "098949993", "Computer Network");
        Person gv3 = new GiaoVien("345", "Nguyen Van F", "nguyenvanf@gmail.com", "Hai Phong", "0975456435", "Big Data");

        System.out.println(gv1.show());
        System.out.println(gv2.show());
        System.out.println(gv3.show());


        System.out.println("Enter student name: ");

        Scanner sc = new Scanner(System.in);
        String namePerson = sc.nextLine();
        if(namePerson.equals(svtn1.getName()) || namePerson.equals(svtn2.getName()) || namePerson.equals(svtn3.getName()) || namePerson.equals(svnn1.getName()) || namePerson.equals(svnn2.getName()) || namePerson.equals(svnn3.getName())) {
            Person p1 = new SinhVien();
            p1.position();
        } else if (namePerson.equals(gv1.getName()) || namePerson.equals(gv2.getName()) || namePerson.equals(gv3.getName())) {
            Person p2 = new GiaoVien();
            p2.position();
        }



        MonHoc[] monhocs = new MonHoc[100];
        int n;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("number of subjects: ");
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


