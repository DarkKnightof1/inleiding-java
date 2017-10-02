package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op104 extends Applet {

    int jaartal;
    int maanden;
    TextField tekstvak1, tekstvak2;
    Label label1, label2;
    String tekst, tekst2;

    public void init() {
        tekstvak1 = new TextField("", 5);
        tekstvak1.addActionListener( new VakListener() );
        tekstvak2 = new TextField("", 5);
        tekstvak2.addActionListener( new VakListener() );
        tekst = "";
        tekst2 = "";
        label1 = new Label("Geef het maand nummer en druk op enter" );
        label2 = new Label ("Geef het jaar en druk enter op enter");
        add( label1 );
        add( tekstvak1 );
        add( label2);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 85 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s1;
            String s2;
            s1 = tekstvak1.getText();
            s2 = tekstvak2.getText();
            maanden = Integer.parseInt(s1);
            jaartal = Integer.parseInt(s2);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {

                switch (maanden) {
                    case 1:
                        tekst = "Januari 31 dagen";
                        break;
                    case 2:
                        tekst = "Februarie 29 dagen";
                        break;
                    case 3:
                        tekst = "Maart 31 dagen";
                        break;
                    case 4:
                        tekst = "April 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus 31 dagen";
                        break;
                    case 9:
                        tekst = "September 30 dagen";
                        break;
                    case 10:
                        tekst = "Oktober 31 dagen";
                        break;
                    case 11:
                        tekst = "November 30 dagen";
                        break;
                    case 12:
                        tekst = "December 31 dagen";
                        break;
                    default:
                        tekst = "U hebt een verkeerd nummer ingetikt ..!";
                        break;
                }
            }

                else {
                switch (maanden) {
                    case 1:
                        tekst = "Januari 31 dagen";
                        break;
                    case 2:
                        tekst = "Februarie 28 dagen";
                        break;
                    case 3:
                        tekst = "Maart 31 dagen";
                        break;
                    case 4:
                        tekst = "April 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus 31 dagen";
                        break;
                    case 9:
                        tekst = "September 30 dagen";
                        break;
                    case 10:
                        tekst = "Oktober 31 dagen";
                        break;
                    case 11:
                        tekst = "November 30 dagen";
                        break;
                    case 12:
                        tekst = "December 31 dagen";
                        break;
                    default:
                        tekst = "U hebt een verkeerd nummer ingetikt ..!";
                        break;
                }
            }

                repaint();
            }
        }
    }

