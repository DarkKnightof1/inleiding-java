import java.awt.*;
import java.applet.*;
import java.util.Random;

public class javascript1 extends Applet {

        public void paint(Graphics g) {

            Random randomiser = new Random();
            int random = randomiser.nextInt(6) + 1;


            g.drawString("" + random, 50, 50);





        }
    }