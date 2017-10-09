package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Op112 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 20; teller > 10; teller--) {
            x += 20;
            //g.drawLine(x, 50, x, 300 );
            g.drawString("" + teller, x, 305 );
        }


    }

}