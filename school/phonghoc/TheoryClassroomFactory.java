package school.phonghoc;

public class TheoryClassroomFactory extends AbstractFactory{

    @Override
    public TheoryClassroom getTheoryClassroom(String theoryclassroom) {
        if (theoryclassroom.equals(null)) return null;

        if (theoryclassroom.equalsIgnoreCase("Phong ly Thuyet Hoa")) {
            return new ChemicalTheoryClassroom();
        } else if (theoryclassroom.equalsIgnoreCase("Phong ly Thuyet Tin")) {
            return new InformaticTheoryClassroom();
        }
        return null;
    }

    @Override
    public PracticeClassroom getPracticeClassroom(String practiceclassroom) {
        return null;
    }
}
