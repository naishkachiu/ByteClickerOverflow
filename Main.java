import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;  

public class Main {
  static Byte score = 120;  
public static void main(String[] args) {  
    
    JFrame f=new JFrame("Button Example");  
    final JLabel tf=new JLabel();  
    
    
    tf.setBounds(50,50, 150,20); 
    tf.setText(Main.score.toString());
    final JLabel bf=new JLabel(); 
    bf.setBounds(150,50, 150,20); 
    bf.setText(Integer.toBinaryString(Main.score & 0xFF));
    JButton b=new JButton("+1"); 

    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
        //Add 1
        Main.score = (byte) (Main.score + 1);
        tf.setText(Main.score.toString());
        bf.setText(Integer.toBinaryString(Main.score & 0xFF));  
        }  
    });  
    JButton c=new JButton("+10");
    c.setBounds(50,150,95,30);  
    c.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
        //Add 10
        Main.score = (byte) (Main.score + 10);
        tf.setText(Main.score.toString()); 
        bf.setText(Integer.toBinaryString(Main.score & 0xFF)); 
        }  
    });
    JButton m1 = new JButton("-1"); 

    m1.setBounds(100,100,95,30);  
    m1.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
        //Minus 1
        Main.score = (byte) (Main.score - 1);
        tf.setText(Main.score.toString());
        bf.setText(Integer.toBinaryString(Main.score & 0xFF));  
        }  
    });
    f.add(b);f.add(tf);f.add(c);f.add(bf);f.add(m1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}

}  