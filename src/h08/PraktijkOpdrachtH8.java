package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdrachtH8 extends Applet {
    TextField tekstvak1, tekstvak2;
    Button knop1, knop2, knop3, knop4;
    String schermtekst1;
    Label label1;
    double getal1;
    double getal2;
    double antwoord1;
    double antwoord2;
    double antwoord3;
    double antwoord4;

    public void init() {
        schermtekst1 = "";
        tekstvak1 = new TextField("", 5);
        tekstvak2 = new TextField("", 5);
        label1 = new Label("Som:");
        knop1 = new Button("*");
        knop1.addActionListener(new Knoplistener1());
        knop2 = new Button("/");
        knop2.addActionListener(new Knoplistener2());
        knop3 = new Button("+");
        knop3.addActionListener(new Knoplistener3());
        knop4 = new Button("-");
        knop4.addActionListener(new Knoplistener4());
        add(label1);
        add(tekstvak1);
        add(tekstvak2);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }

    public void paint(Graphics g) {
    }

    class Knoplistener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst1 = tekstvak1.getText();
            String s1 = tekstvak1.getText();
            String s2 = tekstvak2.getText();
            getal1 = Double.parseDouble(s1);
            getal2 = Double.parseDouble(s2);
            repaint();
            antwoord1 = (getal1 * getal2);
            tekstvak1.setText("" + antwoord1);
            tekstvak2.setText("");
        }
    }

    class Knoplistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst1 = tekstvak1.getText();
            String s1 = tekstvak1.getText();
            String s2 = tekstvak2.getText();
            getal1 = Double.parseDouble(s1);
            getal2 = Double.parseDouble(s2);
            repaint();
            antwoord2 = (getal1 / getal2);
            tekstvak1.setText("" + antwoord2);
            tekstvak2.setText("");
        }
    }

    class Knoplistener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst1 = tekstvak1.getText();
            String s1 = tekstvak1.getText();
            String s2 = tekstvak2.getText();
            getal1 = Double.parseDouble(s1);
            getal2 = Double.parseDouble(s2);
            repaint();
            antwoord3 = (getal1 + getal2);
            tekstvak1.setText("" + antwoord3);
            tekstvak2.setText("");
        }
    }

    class Knoplistener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst1 = tekstvak1.getText();
            String s1 = tekstvak1.getText();
            String s2 = tekstvak2.getText();
            getal1 = Double.parseDouble(s1);
            getal2 = Double.parseDouble(s2);
            repaint();
            antwoord4 = (getal1 - getal2);
            tekstvak1.setText("" + antwoord4);
            tekstvak2.setText("");
        }
    }

}








