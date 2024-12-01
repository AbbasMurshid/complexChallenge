public class chlg2 {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScore("Abbas Murshid", position);

        position=calculateHighScorePosition(1000);
        displayHighScore("Abbas Murshid", position);

        position=calculateHighScorePosition(500);
        displayHighScore("Abbas Murshid", position);

        position=calculateHighScorePosition(100);
        displayHighScore("Abbas Murshid", position);

        position=calculateHighScorePosition(25);
        displayHighScore("Abbas Murshid", position);
    }
     public static void displayHighScore(String playerName, int position) {
        System.out.println(playerName +
                " managed to get into  position: "
                + position +
                " on the high ScoreList");
     }

    public static int calculateHighScorePosition (int score){
        int place = 0;
        if(score >= 1000){
             place= 1;
        }
        else if(score >= 500){
            place = 2;
        }
        else if(score >= 100){
            place = 3;
        }
        else{
            place = 4;
        }
        return place;

    }
}
