package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op83 extends Applet {
    TextField tekstvak;
    Button knop1;
    String schermtekst;
    Label label1;
    double totaal;

    public void init() {
        schermtekst = "";
        tekstvak = new TextField("", 30);
        label1 = new Label ("Type het bedrag hier:");
        knop1 = new Button("Ok");
        knop1.addActionListener( new KnopListener1() );
        tekstvak.addActionListener( new KnopListener1());
        add(label1);
        add(tekstvak);
        add(knop1);
    }

    public void paint(Graphics g) {
        g.drawString("Bedrag + BTW= " + (double)(totaal / 100 * 121), 50, 60 );
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            String s1 = tekstvak.getText();
            totaal = Double.parseDouble(s1);
            repaint();
            tekstvak.setText("");
        }
    }


}


