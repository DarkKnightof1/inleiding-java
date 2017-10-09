package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Op114 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller <= 10; teller++) {
            y += 20;
            //g.drawLine(50, y, 300, y );
            g.drawString("" + (3*teller), 25, y );
        }


    }

}