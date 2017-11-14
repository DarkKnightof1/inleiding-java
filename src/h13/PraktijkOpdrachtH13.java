package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PraktijkOpdrachtH13 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        tekenBomen(g, 40, 40, 120, 120, 85, 140, 30, 140);
    }

    void tekenBomen( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {


        int getal;
        x1 = 0;
        x3 = 45;
        for (getal = 0; getal < 5; getal++) {
            x1 += 80;
            x3 += 80;
            g.setColor(Color.red);
            g.fillRect(x3, y3, x4, y4);
            g.setColor(Color.green);
            g.fillOval(x1, y1, x2, y2);
        }
        x1 = 20;
        x3 = 65;
        for (getal = 0; getal < 5; getal++) {
            x1 += 80;
            x3 += 80;
            g.setColor(Color.red);
            g.fillRect(x3, y3 + 200, x4, y4);
            g.setColor(Color.green);
            g.fillOval(x1, y1 + 200, x2, y2);
        }
    }

}



