import java.util.Scanner;

public class Caesar{
    static int choice = 0;
    public static void main(String[] args){
        getPositivNumber();
        encrypt (choice);
    }

    public static void getPositivNumber() {

        System.out.println("Please enten a key(must be positiv):");
        try {
            Scanner scanner = new Scanner(System.in);
            String inStr = scanner.nextLine();
            int inInt = Integer.parseInt(inStr);

            if (inInt < 0) {
                System.out.println("Invalid input! You have to enter positiv number");
                getPositivNumber();
            } else {
                choice = inInt;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input! You have to enter a number");
            getPositivNumber();
        }
    }

    public static void encrypt(int h){

        int key = h % 26;
        System.out.print("plaintext: ");
        Scanner s1 = new Scanner(System.in);
        String inputString = s1.nextLine();

        char[] charArray = inputString.toCharArray();
        System.out.print("ciphertext: ");
        for(char c : charArray){
            if (Character.isLowerCase(c)){
                int a = c;
                a = a + key;
                if (a > 122){
                 int b = (a % 122) + 96;
                 c = (char) b;
                } else {
                    c = (char) a;
                }
            } else if (Character.isUpperCase(c)) {
                int a = c;
                a = a + key;
                if (a > 90){
                    int b = (a % 90) + 64;
                    c = (char) b;
                } else {
                    c = (char) a;
                }
            } else {

            }
            System.out.print(c);
        }





}
}