package ee.itcollege.exercises.day1;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AkenNaidis {
    
    public static void main(String[] args) {
        
        JFrame aken = new JFrame("Naidis");
        aken.setSize(300, 200);
        aken.setLayout(new GridLayout(2, 1));
        aken.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

        JTextField vali = new JTextField();
        vali.setText("Tere!");
        aken.add(vali);
        vali.addKeyListener(new KeyAdapter() {
        	int spaceCounter = 0;
        	
        	@Override
        	public void keyTyped(KeyEvent e) {
        		char key = e.getKeyChar();
        		
        		if (key == 'õ') {
        			key = 'ö';
				} else if (key == ' ') {
					spaceCounter += 1;
				}
        		if (spaceCounter == 3) {
            		e.consume();
            		spaceCounter = 0;
				} else {
	        		e.setKeyChar(key);					
				}

        	}
		});
        
        JButton nupp = new JButton("Kasva suureks!");
        aken.add(nupp);
        aken.setVisible(true);
        
        nupp.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		vali.setFont(new Font(Font.SERIF, Font.ITALIC, vali.getFont().getSize() + 1));
        	}
		});
        
    }
}