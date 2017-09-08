package h06;

import java.applet.Applet;
import java.awt.*;

public class Op61 extends Applet {

    Color Jan;
    Color Ali;
    Color Jeannette;
    Color Mischa;
    int totaalpersonen;
    int totaalgeld;
    int Jandeel;
    int Alideel;
    int Jeannettedeel;
    int Mischadeel;

    public void init() {
        totaalpersonen = 4;
        totaalgeld = 113;
        Jandeel = (totaalgeld / totaalpersonen);
        Alideel = (totaalgeld / totaalpersonen);
        Jeannettedeel = (totaalgeld / totaalpersonen);
        Mischadeel = (totaalgeld / totaalpersonen);

    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        g.drawString("Jan's deel  €" + Jandeel, 50, 40);
        g.drawString("Ali's deel  €" + Alideel, 50, 80);
        g.drawString("Jeannette's deel  €" + Jeannettedeel, 50, 120);
        g.drawString("Mischa's deel  €" + Mischadeel, 50,160);

    }

}
