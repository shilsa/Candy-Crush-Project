/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class writetofile {
    public void writetofile(){
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("filetext.txt", true)));
            for(Player objPlayer: Data.getInstance().getPlayer_list()){
                out.println(objPlayer.getName());
                out.println(objPlayer.getScore());
            }
            out.close();
        } catch (IOException e) {
        }
    }
}    

