import java.util.InputMismatchException;
import java.util.Scanner;

public class Mario {

    public static void main(String[] args) {
        System.out.println("Hello. Select the number between 1 and 8. Height:");
        marioGo();
    }

    public static void marioGo() throws InputMismatchException {
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number > 0 && number <= 8) {
                String s = "#";
                for(int i = 0; i < number; i++){
                    System.out.printf("%"+number+"s"+"  "+s+"\n", s);
                    s = s + "#";
                }
            } else {
                System.out.println("Try again");
                marioGo();
            }
        } catch (InputMismatchException e){
            System.out.println("Its not a number. Try again!");
            marioGo();
        }
    }
}