package school.phonghoc;

public class PracticeClassroomFactory extends AbstractFactory{

    @Override
    public PracticeClassroom getPracticeClassroom(String practiceclassroom) {
        if (practiceclassroom.equals(null)) return null;

        if (practiceclassroom.equalsIgnoreCase("Phong Thuc Hanh Hoa")) {
            return new ChemicalPracticeRoom();
        } else if (practiceclassroom.equalsIgnoreCase("Phong Thuc Hanh Tin")) {
            return new InformaticPracticeRoom();
        }
        return null;
    }
    @Override
    public TheoryClassroom getTheoryClassroom(String theoryclassroom) {
        return null;
    }

}
