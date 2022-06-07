package school.phonghoc;

import java.util.ArrayList;
import java.util.Scanner;

public class ChemicalTheoryClassroom implements TheoryClassroom{

    private ArrayList chemicalTheoryClassroom;

    public ChemicalTheoryClassroom() {
        chemicalTheoryClassroom = new ArrayList(10);
    }

    public void addRoom(ClassroomFactory classroomFactory) {
        chemicalTheoryClassroom.add(classroomFactory);
    }




    @Override
    public void create(Scanner sc) {
        ClassroomFactory classroomFactory;

        System.out.print("number of Chemical Theory Classroom: ");
        int n = sc.nextInt();

        System.out.println("Enter room list: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Room " +(i + 1) + ": " );
            classroomFactory = new ClassroomFactory();
            classroomFactory.enterInformation(sc);
            addRoom(classroomFactory);
        }
    }
}
