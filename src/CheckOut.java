import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        String yn = "";
        boolean done = false;
        double yes = 0.0;


        do {
            yes = SafeInput.getRangedDouble(pipe, "Enter price of your item", 0.0, 10.0);

            if (SafeInput.getYNConfirm(pipe, "Do you want to get more?") == true) {
                yes += SafeInput.getRangedDouble(pipe, "Enter price of your item", 0.0, 10.0);
            }
            else {
                System.out.println(yes);
                done = false;
            }

        }while(done == true);

        System.out.println(yes);
    }
}
