import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        System.out.println("Celsius to Fahrenhiet Coversion Table");
        System.out.println("| Celsius: 232" + " = " + "Fahrenhiet: " + CtoF(232) + " |");
        System.out.println("| Celsius: 218" + " = " + "Fahrenhiet: " + CtoF(218) + " |");
        System.out.println("| Celsius: 204" + " = " + "Fahrenhiet: " + CtoF(204) + " |");
        System.out.println("| Celsius: 191" + " = " + "Fahrenhiet: " + CtoF(191) + " |");
        System.out.println("| Celsius: 177" + " = " + "Fahrenhiet: " + CtoF(177) + " |");

    }
    public static double CtoF(double Celsius) {
        double fahrenhiet = 0.0;

        fahrenhiet = (Celsius * 1.8) + 32;

        return fahrenhiet;
    }
}
