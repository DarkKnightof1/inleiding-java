package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op81 extends Applet {
    TextField tekstvak;
    Button knop1, knop2;
    String schermtekst;
    Label label1;

    public void init() {
        schermtekst = "";
        tekstvak = new TextField("", 30);
        label1 = new Label ("Type tekst hier:");
        knop1 = new Button("Ok");
        knop1.addActionListener( new KnopListener1() );
        knop2 = new Button("Reset");
        knop2.addActionListener( new Knoplistener2() );
        add(label1);
        add(tekstvak);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }
    class Knoplistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
        }
    }

}



