package ShapeArea;

import java.util.Scanner;

public class Console {
    private Scanner scanner = new Scanner(System.in);
    int input1;

    public int getInput(String msg) {
        System.out.println(msg);

        while (true) {
            if (scanner.hasNextInt()) {

                input1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Enter a valid value.");
                scanner.next();
            }
        }
        return input1;
    }
}
