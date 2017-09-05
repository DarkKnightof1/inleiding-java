package h04;

import java.applet.Applet;
import java.awt.*;

public class Op43 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.red);
        g.fillRect(50, 80, 300, 40);
        g.setColor(Color.white);
        g.fillRect(50, 120, 300, 40);
        g.setColor(Color.blue);
        g.fillRect(50, 160, 300, 40);

        g.setColor(Color.gray);
        g.fillRect(30, 80, 20, 400);
    }
}