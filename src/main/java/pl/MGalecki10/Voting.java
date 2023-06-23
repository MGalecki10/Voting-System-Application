package pl.MGalecki10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {
        List<String> voters = new ArrayList<>();

        voters.add("Jan Kowalski");
        voters.add("Zigniew Siobro");
        voters.add("Zbyszek Stonoga");

        Voting voting = new Voting();

        VotingResult votingResult = voting.executeVoting(voters, new Scanner(System.in));
        votingResult.printResults();
    }

    VotingResult executeVoting(List<String> voters, Scanner scanner) {

        VotingResult votingResult = new VotingResult();

        for (String voter : voters) {
            Boolean vote = getVoteForVoter(voter, scanner);
            votingResult.addVote(new Vote(voter, vote));
        }

        return votingResult;
    }

    private Boolean getVoteForVoter(String voter, Scanner scanner) {
        System.out.println("Jak głosuje " + voter + "? (z - za, p - przeciw, w - wstrzymanie się)");
        while (true) {
            String voteAsString = scanner.nextLine();
            switch (voteAsString) {
                case "z" -> {
                    return true;
                }
                case "p" -> {
                    return false;
                }
                case "w" -> {
                    return null;
                }
                default -> System.out.println("Błędna odpowiedź. Ponawiamy głosowanie");
            }
        }
    }
}