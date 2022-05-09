public class WordMatch {
    private String secret;
    
    public WordMatch(String word){
        secret = word;
    }

    public int scoreGuess(String guess){
        int cnt =  0;
        int length = guess.length();
        for (int i = 0; i<secret.length()-guess.length(); i++){
            if (secret.substring(i, i+length) == guess) cnt++;
        }
        return cnt * length * length;
    }

    public String findBetterGuess (String guess1, String guess2){
        if (scoreGuess(guess1) > scoreGuess(guess2)) return guess1;
        else return guess2;
    }

}