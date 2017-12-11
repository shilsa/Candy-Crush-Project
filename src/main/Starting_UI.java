import javax.swing.*;
import java.awt.*;
public class Starting_UI {
    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JButton b2;
    private JLabel lab;
    private ImageIcon img;
    
    public Starting_UI() {
        gui();
    }
    public void gui() {
        f = new JFrame("Candy Crush");
        f.setVisible(true);
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p = new JPanel(new GridBagLayout());
        
  


   
        
        b1 = new JButton("New Game");
        b2 = new JButton("Exit");
        
        
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.insets = new Insets(0,0,20,0);
        c.gridx = 0;
        c.gridy = 1;
        p.add(b1,c);
        
        c.gridx = 0;
        c.gridy = 2;
        p.add(b2,c);
        
        f.add(p);
        
        
    }
    


    public static void main(String[] args) {
        new Starting_UI();
    }

    
}
