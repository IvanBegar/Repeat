package a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Plurality {
    public static void main(String[] args) {

        System.out.println("How many candidates will be?");
        int b = numberOfVoters();
        ArrayList<Candidate> cand = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            System.out.println("Please set the name of candidate: ");
            cand.add(Candidate.factory(candidateName()));
        }
        System.out.println("How many voters will be?");
        int k = numberOfVoters();
        for (Candidate c : cand) {
            System.out.println(c);
        }

        for (int i = 0; i < k; i++) {
            countingVotes(candidateName(), cand);
        }
        Collections.sort(cand);
        System.out.println(cand.get(0).getName());
    }

    public static String candidateName() {
        Scanner s2 = new Scanner(System.in);
        String n1 = s2.nextLine();
        return n1;
    }

    public static int numberOfVoters() {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        return a;

    }

    public static void countingVotes(String s, ArrayList<Candidate> cand) {
        ArrayList<String> names = new ArrayList<>();
        for (Candidate a : cand) {
            names.add(a.getName());
            }
        if (names.contains(s)) {
            for (Candidate b : cand) {
                if (s.equals(b.getName())) {
                    b.vote();
                    break;
                }
            }
        } else {
            System.out.println("Invalid");
            countingVotes(candidateName(), cand);
        }
        }
    }
