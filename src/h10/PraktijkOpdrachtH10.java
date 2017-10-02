package h10;

        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.*;

public class PraktijkOpdrachtH10 extends Applet {

    int cijfer;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
        label = new Label("Geef uw cijfer en druk op enter" );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if (cijfer == 1) {
                tekst = "Slecht";
                repaint();
            }

            if (cijfer == 2) {
                tekst = "Slecht";
                repaint();
            }

            if (cijfer == 3) {
                tekst = "Slecht";
                repaint();
            }

            if (cijfer == 4) {
                tekst = "Onvoldoende";
                repaint();
            }

            if (cijfer == 5) {
                tekst = "Matig";
                repaint();
            }

            if (cijfer == 6) {
                tekst = "Voldoende";
                repaint();
            }

            if (cijfer == 7) {
                tekst = "Voldoende";
                repaint();
            }

            if (cijfer == 8) {
                tekst = "Goed";
                repaint();
            }

            if (cijfer == 9) {
                tekst = "Goed";
                repaint();
            }

            if (cijfer == 10) {
                tekst = "Goed";
                repaint();
            }

            if (cijfer > 10) {
                tekst = "U hebt een verkeerd cijfer ingevoerd.";
                repaint();
            }

            //Manier 2
            //switch (cijfer) {
                //case 1:
                    //tekst = "Slecht";
                    //break;
                //case 2:
                    //tekst = "Slecht";
                    //break;
                //case 3:
                    //tekst = "Slecht";
                    //break;
                //case 4:
                    //tekst = "Onvoldoende";
                    //break;
                //case 5:
                    //tekst = "Matig";
                    //break;
                //case 6:
                    //tekst = "Voldoende";
                    //break;
                //case 7:
                    //tekst = "Voldoende";
                    //break;
                //case 8:
                    //tekst = "Goed";
                    //break;
                //case 9:
                    //tekst = "Goed";
                    //break;
                //case 10:
                    //tekst = "Goed";
                    //break;
                //default:
                    //tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    //break;
            //}
        //}

        }

    }
}
