import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCards {

    public static void main(String[] args){
        long num = numberVal();
        cardValidation(num);
    }

    private static long numberVal()  throws InputMismatchException {
        long num = 0;
        try {
            System.out.print("Enter any number:");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextLong();
        } catch (InputMismatchException e) {
            numberVal();
        }
        return num;
    }

    private static void cardValidation(long ccn){
        long digit = 0;
            int lenght = 0;
            String s1 = Long.toString(ccn);
            char [] creditCardInt2 = s1.toCharArray();

            while (ccn > 0) {
                ccn = ccn / 10;
                lenght++;
            }
            long[] creditCardInt = new long[lenght];


            for (int i = creditCardInt.length - 2; i >= 0; i = i - 2) {
                long temp = creditCardInt[i];
                temp = temp * 2;
                if (temp > 9) {
                    temp = temp % 10 + 1;
                }
                creditCardInt[i] = temp;
            }

            for (int i = 0; i < creditCardInt.length; i++) {
                digit = +creditCardInt[i];
            }
             if (digit % 10 == 0) {


                 if (lenght == 13) {
                     if (creditCardInt2[0] == '4') {
                         System.out.println("VISA");
                     } else {
                         System.out.println("INVALID");
                     }
                 } else if (lenght == 15) {
                     if (creditCardInt2[0] == '3' && creditCardInt2[1] == '4'){
                         System.out.println("AMEX");
                     } else if (creditCardInt2[0] == '3' && creditCardInt2[1] == '7'){
                         System.out.println("AMEX");
                     } else {
                         System.out.println("INVALID");
                     }
                 } else if (lenght == 16) {
                     if (creditCardInt2[0] == '4') {
                         System.out.println("VISA");
                     } else if (creditCardInt2[0] == '5' && creditCardInt2[1] == '1') {
                         System.out.println("MASTERCARD");
                     } else if (creditCardInt2[0] == '5' && creditCardInt2[1] == '2') {
                         System.out.println("MASTERCARD");
                     } else if (creditCardInt2[0] == '5' && creditCardInt2[1] == '3') {
                         System.out.println("MASTERCARD");
                     } else if (creditCardInt2[0] == '5' && creditCardInt2[1] == '4') {
                         System.out.println("MASTERCARD");
                     } else if (creditCardInt2[0] == '5'&& creditCardInt2[1] == '5') {
                         System.out.println("MASTERCARD");
                     } else {
                         System.out.println("INVALID");
                     }
                 } else {
                     System.out.println("INVALID");
                 }
             } else {
                 System.out.println("INVALID");
        }
    }

}
