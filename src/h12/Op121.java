package h12;

import java.awt.*;
import java.applet.*;

    public class Op121 extends Applet {
        double gemiddelde[];
        double uitkomst[];

        public void init() {
            gemiddelde = new double [10];
            uitkomst = new double[10];

            for (int teller = 0; teller < gemiddelde.length; teller ++) {
                gemiddelde[teller] = teller + 1;
               uitkomst[teller] = (teller + 1);
            }
        }

        public void paint(Graphics g) {
            for (int teller = 0; teller < gemiddelde.length; teller ++) {
                g.drawString("" + gemiddelde[teller], 50, 20 * teller + 20);
                g.drawString("gemiddelde:" + uitkomst[teller], 90, 20* teller + 20);
            }
        }
    }
