package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);
        g.drawLine(20, 20, 400, 20);

        g.drawRect(20, 80, 380, 200);

        g.drawRoundRect(20, 340, 380, 200, 30, 30);

        g.setColor(Color.magenta);
        g.fillRect(420, 80, 380, 200);
        g.setColor(Color.black);
        g.drawOval(420,80,380,200);

        g.setColor(Color.magenta);
        g.fillOval(420,340,380,200);

        g.setColor(Color.black);
        g.drawOval(820,80,380,200);
        g.setColor(Color.magenta);
        g.fillArc(820, 80, 380, 200, 0, 45);

        g.setColor(Color.black);
        g.drawOval(910, 360, 200, 200);

        g.drawString("Lijn", 160, 40 );
        g.drawString("Rechthoek", 160, 300 );
        g.drawString("Afgeronde rechthoek", 160, 560 );

        g.drawString("Gevulde rechthoek met ovaal", 560, 300 );
        g.drawString("Gevulde ovaal", 560, 560 );

        g.drawString("Taartpunt met ovaal eromheen", 960, 300 );
        g.drawString("Cirkel", 990, 590 );

    }

}