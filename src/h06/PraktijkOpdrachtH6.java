package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtH6 extends Applet {
   double a,b,c,result1;

    int result3;
    double result2;

    double result4;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        result1 = (a + b + c) / 3;
        result2 = (result1 * 10);
        result3 = (int) result2;
        result4 = (double) result3 / 10;

    }
    public void paint(Graphics g){
        setBackground(Color.lightGray);
        g.drawString("lol =  " + result4, 50, 40);

    }
}