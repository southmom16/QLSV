package school.phonghoc;

import java.util.ArrayList;
import java.util.Scanner;

public class InformaticPracticeRoom implements PracticeClassroom {

    private ArrayList InformaticPracticeRoom;

    public InformaticPracticeRoom() {
        InformaticPracticeRoom = new ArrayList(10);
    }

    public void addRoom(ClassroomFactory sv) {
        InformaticPracticeRoom.add(sv);
    }


    @Override
    public void create(Scanner sc) {
        ClassroomFactory classroomFactory;

        System.out.print("number of Informatic Practice Room: ");
        int n = sc.nextInt();

        System.out.println("Enter room list: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " room: ");
            classroomFactory = new ClassroomFactory();
            classroomFactory.enterInformation(sc);
            addRoom(classroomFactory);
        }
    }
}
