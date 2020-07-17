package a;

public class Candidate implements Comparable {

    private String name;
    private int numberOfVotes;

    private Candidate(String s){
        numberOfVotes = 0;
        name = s;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }


    public void vote(){
        numberOfVotes++;
    }

    static Candidate factory(String s){
        return new Candidate(s);
    }

    public String toString(){
        return "Vote: "+name;
    }

    @Override
    public int compareTo(Object o) {
        int compareVote=((Candidate) o).getNumberOfVotes();
        return compareVote-this.numberOfVotes;
    }
}
