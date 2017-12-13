
package game;


import java.util.ArrayList;
import java.util.List;


public class Data {
    public static Data data = new Data();
    
    /**
     *
     * @return
     */
    public static Data getInstance(){
        return data;
    }

    public static List<Player> Player_list = new ArrayList();

    public List<Player> getPlayer_list(){
        return Player_list;
    }
    
    public void addPlayer(Player objPlayer){
        Player_list.add(objPlayer);
    }
    
}
