package school.main;

import school.person.*;
import school.monhoc.*;
import school.phonghoc.*;
import school.hethongquanly.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

        StringBuilder builder = new StringBuilder("List name: ");
        for(int i=1; i< person.size();i++){
            builder.append( i + "."+ person.get(i).getName() +"  ");
        }
        System.out.println(builder);

        System.out.println("Number of person: " + Person.munberofPersonn);

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


        MonHoc monhoc1 = new MonHoc("123", "Machine Learning", 60, 4, "Nguyen Van A");
        MonHoc monhoc2 = new MonHoc("234", "Big Data", 60, 4, "Nguyen Van B");
        MonHoc monhoc3 = new MonHoc("123", "Computer Network", 45, 3, "Nguyen Van C");


        ArrayList<MonHoc> monhoc = new ArrayList<>();
        monhoc.add(monhoc1);
        monhoc.add(monhoc2);
        monhoc.add(monhoc3);

        System.out.println("Enter subject name: ");

        Scanner sc1 = new Scanner(System.in);
        String nameSubject = sc1.nextLine();

        for (int i = 0; i < monhoc.size(); i++) {
            if (nameSubject.equals(monhoc.get(i).getName_subject())) {
                System.out.println(monhoc.get(i).toString());
            }
        }

        System.out.println("\t--------------------------");

        for (int i = 0; i < monhoc.size(); i++) {
            for (int j = 0; j < monhoc.size(); j++) {
                System.out.println("subject id " + monhoc.get(i).getName_subject() + " equal subject id " + monhoc.get(j).getName_subject() + ": " + monhoc.get(i).equals(monhoc.get(j)));
            }
        }

        System.out.println("\t--------------------------");

        Set<MonHoc> monHocs = new HashSet<MonHoc>();
        monHocs.add(monhoc1);
        monHocs.add(monhoc2);
        monHocs.add(monhoc3);


        for (MonHoc monHoc : monHocs) {
            System.out.println(monHoc);
        }

        System.out.println("------------------------");

        Scanner sc2 = new Scanner(System.in);

        AbstractFactory theoryClassroomFactory = ClassroomFactory.getFactory("Phong Ly Thuyet");
        AbstractFactory practiceClassroomFactory = ClassroomFactory.getFactory("Phong Thuc Hanh");

        TheoryClassroom theoryClassroom1 = theoryClassroomFactory.getTheoryClassroom("Phong Ly Thuyet Hoa");
        theoryClassroom1.create(sc2);

        PracticeClassroom practiceClassroom1 = practiceClassroomFactory.getPracticeClassroom("Phong Thuc Hanh Hoa");
        practiceClassroom1.create(sc2);

        TheoryClassroom theoryClassroom2 = theoryClassroomFactory.getTheoryClassroom("Phong ly Thuyet Tin");
        theoryClassroom2.create(sc2);

        PracticeClassroom practiceClassroom2 = practiceClassroomFactory.getPracticeClassroom("Phong Thuc Hanh Tin");
        practiceClassroom2.create(sc2);

        System.out.println("----------------------");
        SystemFacade systemFacade = new SystemFacade();
        systemFacade.setInformation();
        systemFacade.display();
    }
}

