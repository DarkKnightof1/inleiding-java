package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Op113 extends Applet {

    public void paint(Graphics g) {

        int x = 10;
        int getal1 = 0;
        int getal2 = 1;
        int getal3;
        int a;
        //int teller;



        //for (teller = 0; teller <= 10; teller++) {
            //y += 20;
            //g.drawLine(50, y, 300, y );
            //g.drawString("" + (3*teller), 25, y );
        //}

        for ( a = 2; a < 12; ++a) {
            getal3 = getal1 + getal2;
            x += 20;
            g.drawString( "0  1  ", 5, 25);
            g.drawString("" + getal3, x, 25);
            getal1 = getal2;
            getal2 = getal3;
        }


    }

}