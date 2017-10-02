package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op105 extends Applet {

    double cijfer;
    double aantalgemiddelde;
    double gemiddeldecijfers;
    double gemiddelde;
    TextField tekstvak;
    Button knop1;
    Label label;
    String tekst1, tekst2, tekst3;

    public void init() {
        tekstvak = new TextField("", 5);
        knop1 = new Button("OK");
        knop1.addActionListener(new Knoplistener1());
        knop1.addActionListener(new Knoplistener2());
        knop1.addActionListener(new Knoplistener3());
        //tekstvak.addActionListener(new VakListener1());
        //tekstvak.addActionListener(new VakListener2());
        //tekstvak.addActionListener(new VakListener3());
        tekst1 = "";
        tekst2 = "";
        label = new Label("Geef uw cijfer en druk op OK");
        add(label);
        add(tekstvak);
        add(knop1);
    }

    public void paint(Graphics g) {
        g.drawString(tekst1, 50, 45);
        g.drawString(tekst2, 50, 85 );
        g.drawString(tekst3, 50, 125 );
    }

    class Knoplistener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer >= 5.5) {
                tekst1 = "Voldoende";
                repaint();
            } else {
                tekst1 = "Onvoldoende";
                repaint();
            }
        }
    }

    class Knoplistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer >= 1.0) {
                aantalgemiddelde = (double)aantalgemiddelde + 1;
                gemiddeldecijfers= (double)gemiddeldecijfers + cijfer;
                gemiddelde = (double)gemiddeldecijfers / aantalgemiddelde;
                tekst2 = "Gemiddelde" + gemiddelde;
                repaint();
            }
        }
    }
    class Knoplistener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (gemiddelde >= 5.5) {
                tekst3 = "Geslaagd";
                repaint();
            } else {
                tekst3 = "Niet geslaagd";
                repaint();
            }
        }
    }
}