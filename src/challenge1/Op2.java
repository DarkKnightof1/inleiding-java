package challenge1;

        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.*;

public class Op2 extends Applet {

    private int Nederlandtijd;
    private int Canadatijd;
    private int Australietijd;
    private int Chinatijd;
    private int Turkijetijd;
    private TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 5);
        Button knop1 = new Button("Toon Tijden");
        knop1.addActionListener(new Knoplistener1());
        Label label = new Label("Voer een uur in ");
        add(label);
        add(tekstvak);
        add(knop1);
    }

    public void paint(Graphics g) {
        int x = 40;
        int y = 80;
        //Glace Bay Canada - 5 uur
        if (Nederlandtijd >= 0 && Nederlandtijd < 24) {
            g.drawString("Tijd in Glace Bay: " + Canadatijd + ":00 uur", x, y);
        }
            //Queensland Australië + 8 uur
            if (Nederlandtijd >= 0 && Nederlandtijd < 24) {
                g.drawString("Tijd in Queensland: " + Australietijd + ":00 uur", x, y+15);
            }
                //Hong Kong China + 6 uur
                if (Nederlandtijd >= 0 && Nederlandtijd < 24) {
                    g.drawString("Tijd in Hong Kong: " + Chinatijd + ":00 uur", x, y+30);
                }
                    //Adana Turkije + 1 uur
                    if (Nederlandtijd >= 0 && Nederlandtijd < 24) {
                        g.drawString("Tijd in Adana: " + Turkijetijd + ":00 uur", x, y+45);
                    }
        if (Nederlandtijd > 23) {
            g.drawString("Ongeldige invoer", x, y);
        }
    }

    class Knoplistener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            Nederlandtijd = Integer.parseInt(s);
            Canadatijd = Nederlandtijd - 5;
            if (Canadatijd < 0) {
                Canadatijd = 24 + Canadatijd;
            }
            Australietijd = Nederlandtijd + 8;
            if (Australietijd > 23) {
                Australietijd = Australietijd - 24;
            }
            Chinatijd = Nederlandtijd + 6;
            if (Chinatijd > 23) {
                Chinatijd = Chinatijd - 24;
            }
            Turkijetijd = Nederlandtijd + 1;
            if (Turkijetijd > 23) {
                Turkijetijd = Turkijetijd - 24;
            }
            repaint();
        }
    }
    
}