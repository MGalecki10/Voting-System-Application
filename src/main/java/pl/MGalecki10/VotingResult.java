package pl.MGalecki10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class VotingResult {
    private Map<String, Vote> voteMap = new HashMap<>();

    public void printResults() {
        double agreedCount = 0;
        double disagreedCount = 0;
        double abstainCount = 0;

        Collection<Vote> values = voteMap.values();
        for (Vote vote : values) {
            if (Boolean.TRUE.equals(vote.getVote())) {
                agreedCount++;
            } else if (Boolean.FALSE.equals(vote.getVote())) {
                disagreedCount++;
            } else {
                abstainCount++;
            }
        }

        printResult("Głosów za", agreedCount);
        printResult("Głosów przeciw", disagreedCount);
        printResult("Wstrzymało się", abstainCount);
    }

    private void printResult(String prefix, double count) {
        System.out.printf(prefix + ": %.2f%%\n", (count / voteMap.size() * 100));
    }


    public void printVoteForVoter(String voterName) {
        Vote vote = voteMap.get(voterName);

        String voteAsString = "WSTRZYMAŁ SIĘ";

        if (Boolean.TRUE.equals(vote.getVote())) {
            voteAsString = "ZA";
        } else  if (Boolean.FALSE.equals(vote.getVote())) {
            voteAsString = "PRZECIW";
        }

        System.out.println(vote.getVoter() + ": " + voteAsString);
    }

    public void addVote(Vote vote) {
        voteMap.put(vote.getVoter(), vote);
    }
}