package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op82 extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4;
    Button knop1, knop2, knop3, knop4;
    String schermtekst1, schermtekst2, schermtekst3, schermtekst4, schermtekst5;
    Label label1, label2, label3, label4;
    int totaal1;
    int totaal2;
    int totaal3;
    int totaal4;

    public void init() {
        schermtekst1 = "";
        schermtekst2 = "";
        schermtekst3 = "";
        schermtekst4 = "";
        schermtekst5 = "";
        tekstvak1 = new TextField("", 5);
        tekstvak2 = new TextField("", 5);
        tekstvak3 = new TextField("", 5);
        tekstvak4 = new TextField("", 5);
        label1 = new Label ("Aantal mannen aanwezig:");
        label2 = new Label ("Aantal vrouwen aanwezig:");
        label3 = new Label ("Aantal potentiële vrouwen aanwezig:");
        label4 = new Label ("Aantal potentiële mannen aanwezig:");
        knop1 = new Button("Ok");
        knop1.addActionListener( new Knoplistener1() );
        knop2 = new Button("Ok");
        knop2.addActionListener( new Knoplistener1() );
        knop3 = new Button("Ok");
        knop3.addActionListener( new Knoplistener1() );
        knop4 = new Button("Ok");
        knop4.addActionListener( new Knoplistener1() );
        add(label1);
        add(tekstvak1);
        add(knop1);
        add(label2);
        add(tekstvak2);
        add(knop2);
        add(label3);
        add(tekstvak3);
        add(knop3);
        add(label4);
        add(tekstvak4);
        add(knop4);
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen aanwezig: " + schermtekst1, 50, 160 );
        g.drawString("Aantal vrouwen aanwezig: " + schermtekst2, 50, 180 );
        g.drawString("Aantal potentiële vrouwen aanwezig: " + schermtekst3, 50, 200 );
        g.drawString("Aantal potentiële mannen aanwezig: " + schermtekst4, 50, 220 );
        g.drawString("Totaal aantal aanwezigen: " + (totaal1 + totaal2 + totaal3 + totaal4), 50, 240 );
    }

    class Knoplistener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst1 = tekstvak1.getText();
            schermtekst2 = tekstvak2.getText();
            schermtekst3 = tekstvak3.getText();
            schermtekst4 = tekstvak4.getText();
            String s1 = tekstvak1.getText();
            String s2 = tekstvak2.getText();
            String s3 = tekstvak3.getText();
            String s4 = tekstvak4.getText();
            totaal1 = Integer.parseInt(s1);
            totaal2 = Integer.parseInt(s2);
            totaal3 = Integer.parseInt(s3);
            totaal4 = Integer.parseInt(s4);
            repaint();
            tekstvak1.setText("");
            tekstvak2.setText("");
            tekstvak3.setText("");
            tekstvak4.setText("");
        }
    }

}



