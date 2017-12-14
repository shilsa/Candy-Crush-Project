
package game;


import java.util.ArrayList;


public class Data {
    public static Data data = new Data();
    
    /**
     *
     * @return
     */
    public static Data getInstance(){
        return data;
    }

    public static ArrayList<Player> Player_list = new ArrayList();

    public ArrayList<Player> getPlayer_list(){
        return Player_list;
    }
    
    public void addPlayer(Player objPlayer){
        Player_list.add(objPlayer);
    }
    
}
