
package game;

import javax.security.auth.AuthPermission;

public class Player implements Comparable<Player>{
    private String Name;
    private int Score;

    public Player() {
    }

    public Player(String Name, int Score) {
        this.Name = Name;
        this.Score = Score;
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }
    
    public int compareTo(Player comparePlayer){
       int compareScore = ((Player) comparePlayer).getScore();
       return compareScore - this.getScore();
       
    }
}
