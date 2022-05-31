package school.person;

public class PositionGV extends GiaoVien implements PositionInterface{
    @Override
    public void position() {
        System.out.println("Position: Giao Vien");
    }
}
