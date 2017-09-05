package h04;

import java.applet.Applet;
import java.awt.*;

public class Op46 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);
        g.fillRoundRect(50,120,200,440,20,20);

        g.fillRect(100,560,100,300);
        g.setColor(Color.white);
        g.fillRect(100,780,100,40);
        g.fillRect(100,700,100,40);
        g.fillRect(100,620,100,40);
        g.fillRect(100,560,100,20);

        g.setColor(Color.red);
        g.fillArc(100, 170, 100, 100, 90, 360);
        g.setColor(Color.orange);
        g.fillArc(100, 290, 100, 100, 90, 360);
        g.setColor(Color.green);
        g.fillArc(100, 410, 100, 100, 90, 360);




    }

}