package ee.itcollege.exercises.day1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Graafika extends Applet {
	
	int x = 0;
	
	@Override
	public void init() {
		
	}
	
    @Override
    public void paint(Graphics g) {
    	
        g.setColor(Color.red);
        g.fillRect(0, 0, 100, 100);
        
    }
}