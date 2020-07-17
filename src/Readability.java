import java.util.Scanner;

public class Readability{

    public static void main(String[] args){
        indexCounter();
    }

    public static void indexCounter(){
        char[] c = textConverter();
        double a = lattersCounter(c);
        double b = wordsCounter(c);
        double s = sentenceCounter(c);
        System.out.println(a+" latter(s)");
        System.out.println(b+" word(s)");
        System.out.println(s+" sentence(s)");
        double L = (a/b)*100;
        double S = (s/b)*100;
        double index = (0.0588*L)-(0.296*S)-15.8;
        if (index < 1) {
            System.out.println("Before Grade 1");
        } else if (index >= 16){
            System.out.println("Grade 16+");
        } else {
            System.out.println("Grade "+(int)Math.round(index));
    }
    }

    public static char[] textConverter(){
        System.out.print("Text: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] textInChar = s.toCharArray();
        return textInChar;
    }

    public static int lattersCounter(char[] c) {
        int k = c.length;
        int latter = 0;
        for (int i = 0; i < k; i++) {
            int j = (int) c[i];
            if (j <= 90 && j >= 65){
                latter++;
            } else if (j <= 122 && j >= 97) {
                latter++;
            }
        }
        return latter;
    }

    public static int wordsCounter(char[] c) {
        int p = c.length;
        int words = 0;
        for (int i = 0; i < p; i++) {
            if (c[i] <= ' '){
                words++;
            } else if (i == p-1) {
                words++;
            }
        }
        return words;
    }

    public static int sentenceCounter(char[] c) {
        int r = c.length;
        int sentence = 0;
        for (int i = 0; i < r; i++) {
            if (c[i] == '.' || c[i] == '!' || c[i] == '?'){
                sentence++;
            }
        }
        return sentence;
    }
}