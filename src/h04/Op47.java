package h04;

import java.applet.Applet;
import java.awt.*;

public class Op47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);
        g.fillRoundRect(50,50,400,400,120,120);

        g.setColor(Color.white);
        g.fillOval(75,75,75,75);
        g.fillOval(350,75,75,75);
        g.fillOval(75,350,75,75);
        g.fillOval(350,350,75,75);
    }

}