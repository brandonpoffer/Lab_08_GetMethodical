import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        SafeInput.getRangedInt(pipe, "Enter your birth year", 1950, 2015);
        SafeInput.getRangedInt(pipe, "Enter your birth month", 1, 12);
        SafeInput.getRangedInt(pipe, "Enter your birth day", 1, 31);

    }
}
