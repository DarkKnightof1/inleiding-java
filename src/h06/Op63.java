package h06;

import java.applet.Applet;
import java.awt.*;

public class Op63 extends Applet {

    int positieve1;
    int positieve2;
    int negatieve1;

    public void init() {
        positieve1 = 2147483647;
        positieve2 = 1;
        negatieve1 = (positieve1 + positieve2);

    }
    public void paint(Graphics g){
        setBackground(Color.lightGray);
        g.drawString("2 positieve int bij elkaar die een negatieve int geven =  " + negatieve1, 50, 40);

    }
}
