/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class write_read {
    public void writetofile() throws IOException{
        
            PrintWriter printWriter = new PrintWriter(new FileWriter("filetext.txt"));
            for(Player objPlayer: Data.getInstance().getPlayer_list()){
            printWriter.println(objPlayer.getName());
            printWriter.println(objPlayer.getScore());
            }
            printWriter.close();            
        }
    public void readfromfile() throws IOException{
            BufferedReader bufReader = new BufferedReader(new FileReader("filetext.txt"));
            String line = bufReader.readLine();
            ArrayList<String> list = new ArrayList<String>();
            while(line != null){
                list.add(line);
                line = bufReader.readLine();
                
            }
            bufReader.close();
            for(int i = 0; i < list.size(); i = i+2){
                Player objPlayer = new Player();
                objPlayer.setName(list.get(i));
                objPlayer.setScore(Integer.parseInt(list.get(i+1)));
                Data.getInstance().addPlayer(objPlayer);
            }

    }
}    

