package h04;

import java.applet.Applet;
import java.awt.*;

public class Op41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 120, 150, 0);
        g.drawLine(150, 0, 250, 120);
        g.drawLine(250, 120, 50, 120);

    }
}