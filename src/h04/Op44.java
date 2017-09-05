package h04;

import java.applet.Applet;
import java.awt.*;

public class Op44 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.red);
        g.fillRect(50, 320, 40, 80);
        g.setColor(Color.green);
        g.fillRect(90, 200, 40, 200);
        g.setColor(Color.blue);
        g.fillRect(130, 240, 40, 160);

        g.setColor(Color.black);
        g.drawLine(50,400,50,200);
        g.drawLine(48,400,170,400);
        g.drawLine(48,360,52,360);
        g.drawLine(48,320,52,320);
        g.drawLine(48,280,52,280);
        g.drawLine(48,240,52,240);
        g.drawLine(48,200,52,200);

        g.drawString("0", 25, 400 );
        g.drawString("20", 25, 360 );
        g.drawString("40", 25, 320 );
        g.drawString("60", 25, 280 );
        g.drawString("80", 25, 240 );
        g.drawString("100", 25, 200 );

        g.setColor(Color.red);
        g.drawString("Valerie", 50, 420 );
        g.setColor(Color.green);
        g.drawString("Jeroen", 90, 420 );
        g.setColor(Color.blue);
        g.drawString("Hans", 130, 420 );
    }
}