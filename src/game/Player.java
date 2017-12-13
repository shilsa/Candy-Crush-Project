
package game;

public class Player {
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
    
    
}
