public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getEvenScore(player1Score);
        }

        if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWin(player1Score, player2Score);
        }

        return getRegularScore(player1Score, player2Score);
    }

    private static String getEvenScore(int score) {
        return switch (score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
    }

    private static String getAdvantageOrWin(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;

        if (scoreDifference == 1) return "Advantage player1";
        if (scoreDifference == -1) return "Advantage player2";
        if (scoreDifference >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getScoreDescription(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "";
        };
    }

    private static String getRegularScore(int player1Score, int player2Score) {
        return getScoreDescription(player1Score) + "-" + getScoreDescription(player2Score);
    }
}
