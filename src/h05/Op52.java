package h05;

import java.applet.Applet;
import java.awt.*;

public class Op52 extends Applet {

    Color Valerie;
    Color Jeroen;
    Color Hans;
    int GValerie;
    int GJeroen;
    int GHans;
    int breedte;
    int gewicht1;
    int gewicht2;
    int gewicht3;
    int ynullijn;

    public void init() {
        Valerie = Color.RED;
        Jeroen = Color.GREEN;
        Hans = Color.BLUE;
        GValerie = 40;
        GJeroen = 100;
        GHans = 80;
        breedte = 40;
        ynullijn = 400;
        gewicht1 = (ynullijn - GValerie);
        gewicht2 = (ynullijn - GJeroen);
        gewicht3 = (ynullijn - GHans);

    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Valerie);
        g.fillRect(50, gewicht1, breedte, GValerie);
        g.setColor(Jeroen);
        g.fillRect(90, gewicht2, breedte, GJeroen);
        g.setColor(Hans);
        g.fillRect(130, gewicht3, breedte, GHans);


        g.setColor(Color.black);
        g.drawLine(50,ynullijn,50,300);
        g.drawLine(48,ynullijn,170,ynullijn);
        g.drawLine(48,380,52,380);
        g.drawLine(48,360,52,360);
        g.drawLine(48,340,52,340);
        g.drawLine(48,320,52,320);
        g.drawLine(48,300,52,300);

        g.drawString("0", 25, ynullijn );
        g.drawString("20", 25, 380 );
        g.drawString("40", 25, 360 );
        g.drawString("60", 25, 340 );
        g.drawString("80", 25, 320 );
        g.drawString("100", 25, 300 );

        g.setColor(Color.red);
        g.drawString("Valerie", 50, 420 );
        g.setColor(Color.green);
        g.drawString("Jeroen", 90, 420 );
        g.setColor(Color.blue);
        g.drawString("Hans", 130, 420 );
    }
}