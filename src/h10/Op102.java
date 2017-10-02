package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op102 extends Applet {

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
        tekst2 = "";
        label = new Label("Geef uw leeftijd in en druk op enter" );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
        g.drawString(tekst2, 50, 55 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);
            if (leeftijd >= eind) {
                eind = leeftijd;
                tekst = "" + eind;
               // tekst2 = "" + eind2;
                repaint();
            }

                else   {
                    eind2 = leeftijd;
                 //   tekst = "" + eind;
                    tekst2 = "" + eind2;
                    repaint();
                }
            }
        }
    }
