package school.phonghoc;

import java.util.ArrayList;
import java.util.Scanner;

public class ChemicalPracticeRoom implements PracticeClassroom {

    private ArrayList chemicalPracticeRoom;

    public ChemicalPracticeRoom() {
        chemicalPracticeRoom = new ArrayList(10);
    }

    public void addRoom(ClassroomFactory classroomFactory) {
        chemicalPracticeRoom.add(classroomFactory);
    }


    @Override
    public void create(Scanner sc) {
        ClassroomFactory classroomFactory;

        System.out.print("number of Chemical Practice Room: ");
        int n = sc.nextInt();

        System.out.println("Enter room list: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Room: " + (i + 1) + ": ");
            classroomFactory = new ClassroomFactory();
            classroomFactory.enterInformation(sc);
            addRoom(classroomFactory);
        }
    }

}
