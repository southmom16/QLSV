package school.phonghoc;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomFactory {

    private static final ClassroomFactory INSTANCE = new ClassroomFactory();
    private String id;
    private String roomName;

    private ChemicalPracticeRoom chemicalPracticeRoom;
    private ChemicalTheoryClassroom  chemicalTheoryClassroom;
    private InformaticPracticeRoom informaticPracticeRoom;
    private InformaticTheoryClassroom informaticTheoryClassroom;



    public ClassroomFactory(String id, String roomName) {
        this.id = id;
        this.roomName = roomName;
    }
    public ClassroomFactory(){
        chemicalPracticeRoom = new ChemicalPracticeRoom();
        chemicalTheoryClassroom = new ChemicalTheoryClassroom();
        informaticPracticeRoom = new InformaticPracticeRoom();
        informaticTheoryClassroom = new InformaticTheoryClassroom();
    }

    public static ClassroomFactory getInstance(){
        return INSTANCE;
    }

    public void createRoom(){
        Scanner sc = new Scanner(System.in);
        chemicalTheoryClassroom.create(sc);
        chemicalPracticeRoom.create(sc);
        informaticPracticeRoom.create(sc);
        informaticTheoryClassroom.create(sc);
    }

    public void enterInformation(Scanner sc) {
        System.out.print("\tRoom id: ");
        sc.nextLine();
        id = sc.nextLine();
        System.out.print("\tRoom name: ");
        roomName = sc.nextLine();

    }

    public String getRoomName() {
        return roomName;
    }

    public String getId() {
        return id;
    }
    public static AbstractFactory getFactory(String factory) {
        if(factory.equalsIgnoreCase("Phong Ly Thuyet")) {
            return new TheoryClassroomFactory();
        } else if(factory.equalsIgnoreCase("Phong Thuc Hanh")) {
            return new PracticeClassroomFactory();
        }
        return null;
    }
}
