package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Op115 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 5;
        int x = 5;

        for(teller = 0; teller < 5; teller++) {
            y += 5;
            x += 5;
            g.drawLine(x, y, x + 5, y );
            g.drawLine(x, y + 5, x + 5, y + 5 );
            g.drawLine(x, y, x, y + 5 );
            g.drawLine(x + 5, y, x + 5, y + 5 );
            //g.drawString("" + (3*teller), 25, y );
        }


    }

}