import java.awt.*;
import java.applet.*;
import java.util.Random;

public class javascript2 extends Applet {

    public void paint(Graphics g) {

        String[] kleuren = {"Harten", "Schoppen", "Ruiten", "Klaver"};

        int random = new Random().nextInt(kleuren.length);

        g.drawString(kleuren[random], 50, 50);


    }
}