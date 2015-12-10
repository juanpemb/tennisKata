package tennis;

import java.util.HashMap;
import java.util.Map;

public class Player {
    int score = 0;
    private final String name;

    public Player(String name)
    {
        this.name = name;
    }

    public void score() {
        if(score<4){
            score++;
        }
    }

    public String getScore(){
        return scoreTable.get(score);
    }

    public Integer pointInNumber(){
        return score;
    }

    public String getName(){
        return name;
    }

    public boolean iWiner(Player other){
        return this.score> 3 && score > other.score + 1;
    }

    private static final Map<Integer,String> scoreTable = new HashMap();
    {
        scoreTable.put(0,"Love");
        scoreTable.put(1,"Fifteen");
        scoreTable.put(2,"Thirty");
        scoreTable.put(3,"Forty");
        scoreTable.put(4,"Advantage");
    }

    public boolean isStarting() {
        return score == 0;
    }
}

