import java.util.*;
import java.util.stream.Collectors;

public class TournamentWinner {
    public static final int HOME_TEAM_WON = 1;




    public static String tournamentWinner(
           ArrayList<ArrayList<String>> competitions, List<Integer> results) {
        String currentBestTeam = "";
        Map<String, Integer> scores = new HashMap<>();
        scores.put(currentBestTeam, 0);
        for (int i = 0; i < results.size(); i++) {
            ArrayList<String> competition =competitions.get(i);
            int result = results.get(i);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winingTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;

            updateScores(winingTeam, 3, scores);

            if (scores.get(winingTeam) > scores.get(awayTeam)) {
                currentBestTeam = winingTeam;
            }


        }
        return currentBestTeam;
    }

    private static void updateScores(String team, int points, Map<String, Integer> scores) {
        if (!scores.containsKey(team)) {
            scores.put(team, 0);
        }
        scores.put(team, scores.get(team) + points);
    }
}
