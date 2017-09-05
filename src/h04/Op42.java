package h04;

import java.applet.Applet;
import java.awt.*;

public class Op42 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 120, 150, 0);
        g.drawLine(150, 0, 250, 120);
        g.drawLine(250, 120, 50, 120);
        g.drawLine(50, 120, 50, 300);
        g.drawLine(50, 300, 250, 300);
        g.drawLine(250, 300, 250, 120);

        g.drawLine(70, 200, 120, 200);
        g.drawLine(120, 200, 120, 160);
        g.drawLine(120, 160, 70, 160);
        g.drawLine(70, 160, 70, 200);

        g.drawLine(180, 200, 230, 200);
        g.drawLine(230, 200, 230, 160);
        g.drawLine(230, 160, 180, 160);
        g.drawLine(180, 160, 180, 200);

        g.drawLine(70, 280, 120, 280);
        g.drawLine(120, 280, 120, 240);
        g.drawLine(120, 240, 70, 240);
        g.drawLine(70, 240, 70, 280);

        g.drawLine(190, 300, 220, 300);
        g.drawLine(220, 300, 220, 240);
        g.drawLine(220, 240, 190, 240);
        g.drawLine(190, 240, 190, 300);
    }
}