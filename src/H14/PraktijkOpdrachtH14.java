package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PraktijkOpdrachtH14 {

    TextField textfield = new TextField();
    int aantalplaatjes;
    int input;

    public class javascript2 extends Applet {

        @Override
        public void init() {
            aantalplaatjes = 23;
            Button ok = new Button("ok");
            ok.addActionListener(new KnopListener());
            textfield = new TextField(5);
            add(textfield);
        }

        public void paint(Graphics g) {
            // check of invoer wel 1, 2 of 3 is en dus geldig
            if (input <= 1 || input > 3) {
                g.drawString("foute input", 50, 50);
                //check of gebruiker verloren heeft (aantalplaatjes <= 0)
                if (aantalplaatjes <= 0) {
                    g.drawString("je hebt verloren", 50, 50);
                }
                //check of gebruiker gewonnnen heeft (aantalplaatjes = 1)
                if (aantalplaatjes == 1) {
                    g.drawString("je hebt gewonnen", 50, 50);
                }
            }
        }

        class KnopListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                //haal invoer en maak er een int van
                String s = textfield.getText();
                input = Integer.parseInt(s);
                //haal de geldige invoer van de variable aantalplaatjes
                aantalplaatjes = aantalplaatjes - input;

                //bepaal wat de computer moet doen

            }
        }

    }
}
