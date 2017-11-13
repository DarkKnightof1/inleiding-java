package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Op132 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {

        tekenMuur(g, 10, 20, 40, 20);
    }

    void tekenMuur(Graphics g, int x1, int y1, int x2, int y2) {
        int getal;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.red);
            g.fillRect(x1, y1, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1, x2, y2);
        }
        x1 = 0;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.red);
            g.fillRect(x1, y1 + 20, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 20, x2, y2);
        }
        x1 = 10;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.red);
            g.fillRect(x1, y1 + 40, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 40, x2, y2);
        }
        x1 = 0;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.red);
            g.fillRect(x1, y1 + 60, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 60, x2, y2);
        }
    }
}

