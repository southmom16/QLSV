package school.phonghoc;

public abstract class AbstractFactory {
    public abstract TheoryClassroom getTheoryClassroom(String theoryclassroom);
    public abstract PracticeClassroom getPracticeClassroom(String practiceclassroom);
}
