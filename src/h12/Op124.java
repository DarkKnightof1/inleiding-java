package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Op124 extends Applet {
    boolean gevonden;
    int[] salaris = {50, 100, 150, 200, 250, 300, 350, 400, 450, 500};
    int gezocht;
    int getal;
    TextField textField;
    Button button;

    public void init() {
        textField = new TextField();
        add(textField);
        button = new Button("Ok");
        add(button);
        gevonden = false;
        int teller = 0;
        while (teller < salaris.length) {
            if (salaris[teller] == getal) {
                gevonden = true;
            }
            teller++;
        }

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });


    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
        if (gevonden == true) {
            g.drawString("De waarde = " + getal, 10, 50);

        } else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }
}