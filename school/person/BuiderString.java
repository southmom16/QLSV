package school.person;

public class BuiderString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        for(int i = 0; i<100; i++){
            builder.append("Word");
        }

    }
}
