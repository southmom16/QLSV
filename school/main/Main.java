package school.main;

import school.person.*;
import school.monhoc.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SinhVien svtn1 = new SinhVienTrongNuoc("123", "Nguyen Van A", "nguyenvana@gmail.com", "Ha Noi", "09854623", 100000);
        SinhVien svtn2 = new SinhVienTrongNuoc("234", "Nguyen Van B", "nguyenvanb@gmail.com", "Ha Nam", "098549993", 110000);
        SinhVien svtn3 = new SinhVienTrongNuoc("345", "Nguyen Van C", "nguyenvanc@gmail.com", "Hai Phong", "0985456435", 120000);


        SinhVien svnn1 = new SinhVienNuocNgoai("America", "999", "John", "john@gmail.com", "Canifornia", "09854623", 100000);
        SinhVien svnn2 = new SinhVienNuocNgoai("Campuchia", "999", "Abc", "abc@gmail.com", "BCD", "09854623", 100000);
        SinhVien svnn3 = new SinhVienNuocNgoai("Lao", "999", "Bcd", "bcd@gmail.com", "ABC", "09854623", 100000);


        GiaoVien gv1 = new GiaoVien("1232", "Nguyen Van D", "nguyenvand@gmail.com", "Ha Noi", "09554623", "Math");
        GiaoVien gv2 = new GiaoVien("234", "Nguyen Van E", "nguyenvane@gmail.com", "Ha Nam", "098949993", "Computer Network");
        GiaoVien gv3 = new GiaoVien("345", "Nguyen Van F", "nguyenvanf@gmail.com", "Hai Phong", "0975456435", "Big Data");

        ArrayList<Person> person = new ArrayList<>();
        person.add(svnn1);
        person.add(svnn2);
        person.add(svnn3);
        person.add(svtn1);
        person.add(svtn2);
        person.add(svtn3);
        person.add(gv1);
        person.add(gv2);
        person.add(gv3);

        for (int i = 0; i < person.size(); i++) {
            person.get(i).showInformation();
        }

        System.out.println("Enter student name: ");

        Scanner sc = new Scanner(System.in);
        String namePerson = sc.nextLine();
        if (namePerson.equals(svtn1.getName()) || namePerson.equals(svtn2.getName()) || namePerson.equals(svtn3.getName()) || namePerson.equals(svnn1.getName()) || namePerson.equals(svnn2.getName()) || namePerson.equals(svnn3.getName())) {
            PositionSV person1 = new PositionSV();
            person1.position();
        } else if (namePerson.equals(gv1.getName()) || namePerson.equals(gv2.getName()) || namePerson.equals(gv3.getName())) {
            PositionGV person2 = new PositionGV();
            person2.position();
        }

        System.out.println("-----------------------------\n");

        MonHoc[] monhocs = new MonHoc[100];
        int n;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("number of subjects: ");
        n = sc1.nextInt();
        for (int i = 0; i < n; i++) {
            monhocs[i] = getMonHocInfo();
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

