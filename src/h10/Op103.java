package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op103 extends Applet {

    int leeftijd;
    int eind;
    int eind2;
    TextField tekstvak;
    Label label;
    String tekst, tekst2;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
        tekst = "";
        label = new Label("Geef het maand nummer en druk op enter" );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
       // g.drawString(tekst2, 50, 55 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);
            if (leeftijd == 1) {
                tekst = "Januari 31 dagen";
                repaint();
            }

            if (leeftijd == 2) {
                tekst = "Februarie 28 dagen";
                repaint();
            }

            if (leeftijd == 3) {
                tekst = "Maart 31 dagen";
                repaint();
            }

            if (leeftijd == 4) {
                tekst = "April 30 dagen";
                repaint();
            }

            if (leeftijd == 5) {
                tekst = "Mei 31 dagen";
                repaint();
            }

            if (leeftijd == 6) {
                tekst = "Juni 30 dagen";
                repaint();
            }

            if (leeftijd == 7) {
                tekst = "Juli 31 dagen";
                repaint();
            }

            if (leeftijd == 8) {
                tekst = "Augustus 31 dagen";
                repaint();
            }

            if (leeftijd == 9) {
                tekst = "September 30 dagen";
                repaint();
            }

            if (leeftijd == 10) {
                tekst = "Oktober 31 dagen";
                repaint();
            }

            if (leeftijd == 11) {
                tekst = "November 30 dagen";
                repaint();
            }

            if (leeftijd == 12) {
                tekst = "December 31 dagen";
                repaint();
            }
        }
    }
}
