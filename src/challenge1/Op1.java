package challenge1;

        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.*;

public class Op1 extends Applet {

    Color Red;
    int GValerie;
    int GJeroen;
    int GHans;
    int breedte;
    int gewichtVal;
    int gewichtJer;
    int gewichtHan;
    int ynullijn;
    String schermtekst1, schermtekst2, schermtekst3;
    TextField tekstvak1, tekstvak2, tekstvak3;
    Button knop1;
    Label label1, label2, label3;

    public void init() {
        Red = Color.RED;
        breedte = 40;
        ynullijn = 200;
        schermtekst1 = "";
        schermtekst2 = "";
        schermtekst3 = "";
        tekstvak1 = new TextField("", 4);
        tekstvak2 = new TextField("", 4);
        tekstvak3 = new TextField("", 4);
        label1 = new Label ("Valerie");
        label2 = new Label ("Jeroen");
        label3 = new Label ("Hans");
        knop1 = new Button("Toon");
        knop1.addActionListener( new KnopListener1() );
        knop1.addActionListener( new KnopListener2() );
        knop1.addActionListener( new KnopListener3() );
        add(label1);
        add(tekstvak1);
        add(label2);
        add(tekstvak2);
        add(label3);
        add(tekstvak3);
        add(knop1);

    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Red);
        g.fillRect(75, gewichtVal, breedte, GValerie );
        g.fillRect(135, gewichtJer, breedte, GJeroen );
        g.fillRect(195, gewichtHan, breedte, GHans );

        //getallen
        g.setColor(Color.black);
        g.drawString("0", 38, ynullijn );
        g.drawString("20", 34, 180 );
        g.drawString("40", 34, 160 );
        g.drawString("60", 34, 140 );
        g.drawString("80", 34, 120 );
        g.drawString("100", 30, 100 );
        g.drawString("120", 30, 80 );

        //streepjes
        g.setColor(Color.black);
        g.drawLine(55, ynullijn, 55, 60);
        g.drawLine(55, ynullijn, 255, ynullijn );
        g.drawLine(55, 180, 57, 180 );
        g.drawLine(55, 160, 57, 160 );
        g.drawLine(55, 140, 57, 140 );
        g.drawLine(55, 120, 57, 120 );
        g.drawLine(55, 100, 57, 100 );
        g.drawLine(55, 80, 57, 80 );
        g.drawLine(55, 60, 57, 60 );

        //namen
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 75, 220 );
        g.drawString("Jeroen", 135, 220 );
        g.drawString("Hans", 195, 220 );

    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak1.getText();
            GValerie = Integer.parseInt(s);
            gewichtVal = (ynullijn - GValerie);
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak2.getText();
            GJeroen = Integer.parseInt(s);
            gewichtJer = (ynullijn - GJeroen);
            repaint();
        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak3.getText();
            GHans = Integer.parseInt(s);
            gewichtHan = (ynullijn - GHans);
            repaint();
        }
    }
}