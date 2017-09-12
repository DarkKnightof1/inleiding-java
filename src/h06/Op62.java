package h06;

import java.applet.Applet;
import java.awt.*;

public class Op62 extends Applet {

    int totaalsecondenineenminuut;
    int totaalminutenineenuur;
    int totaalurenineendag;
    int totaaldagenineenjaar;
    int eenuur;
    int eendag;
    int eenjaar;

    public void init() {
        totaalsecondenineenminuut = 60;
        totaalminutenineenuur = 60;
        totaalurenineendag = 24;
        totaaldagenineenjaar = 365;
        eenuur = (totaalsecondenineenminuut * totaalminutenineenuur);
        eendag = (eenuur * totaalurenineendag);
        eenjaar = (eendag * totaaldagenineenjaar);

    }
        public void paint(Graphics g){
            setBackground(Color.lightGray);
            g.drawString("totaal seconden in een uur =  " + eenuur + " seconden", 50, 40);
            g.drawString("totaal seconden in een dag =  " + eendag + " seconden", 50, 80);
            g.drawString("totaal seconden in een jaar =  " + eenjaar + " seconden", 50, 120);

    }
}
