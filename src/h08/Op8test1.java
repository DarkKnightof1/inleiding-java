package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op8test1 extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4;
    Button knop1, knop2, knop3, knop4, knop5;
    String schermtekst1, schermtekst2, schermtekst3, schermtekst4, schermtekst5;
    Label label1, label2, label3, label4, label5;
    int totaal;

    public void init() {
        schermtekst1 = "";
        schermtekst2 = "";
        schermtekst3 = "";
        schermtekst4 = "";
        schermtekst5 = "";
        tekstvak1 = new TextField("", 30);
        tekstvak2 = new TextField("", 30);
        tekstvak3 = new TextField("", 30);
        tekstvak4 = new TextField("", 30);
        label1 = new Label ("Type tekst hier:");
        label2 = new Label ("Type tekst hier:");
        label3 = new Label ("Type tekst hier:");
        label4 = new Label ("Type tekst hier:");
        label5 = new Label ("totaal aantal personen aanwezig");
        knop1 = new Button("Ok");
        knop1.addActionListener( new KnopListener1() );
        knop2 = new Button("Reset");
        knop2.addActionListener( new Knoplistener2() );
        knop3 = new Button("Reset");
        knop3.addActionListener( new Knoplistener3() );
        knop4 = new Button("Reset");
        knop4.addActionListener( new Knoplistener4() );
        //knop5 = new Button("Totaal");
        //knop5.addActionListener( new Knoplistener5() );
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
        add(label5);
        //add(knop5);

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst1, 50, 160 );
        g.drawString(schermtekst2, 50, 180 );
        g.drawString(schermtekst3, 50, 200 );
        g.drawString(schermtekst4, 50, 220 );
        g.drawString("" + (totaal + totaal), 50, 240 );
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst1 = tekstvak1.getText();
            repaint();
            tekstvak1.setText("");
            tekstvak2.setText("");
            tekstvak3.setText("");
            tekstvak4.setText("");
        }
    }

    class Knoplistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst2 = tekstvak2.getText();
            repaint();
            tekstvak1.setText("");
            tekstvak2.setText("");
            tekstvak3.setText("");
            tekstvak4.setText("");
        }
    }

    class Knoplistener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst3 = tekstvak3.getText();
            repaint();
            tekstvak1.setText("");
            tekstvak2.setText("");
            tekstvak3.setText("");
            tekstvak4.setText("");
        }
    }

    class Knoplistener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst4 = tekstvak4.getText();
            repaint();
            tekstvak1.setText("");
            tekstvak2.setText("");
            tekstvak3.setText("");
            tekstvak4.setText("");
        }
    }

    class Knoplistener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = (tekstvak1.getText() + tekstvak2.getText() + tekstvak3.getText() + tekstvak4.getText());
            totaal = Integer.parseInt(s);
            repaint();
            tekstvak1.setText("");
            tekstvak2.setText("");
            tekstvak3.setText("");
            tekstvak4.setText("");
        }
    }

}



