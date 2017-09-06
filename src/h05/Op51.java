package h05;

import java.applet.Applet;
import java.awt.*;


        public class Op51 extends Applet{
            Color opvulkleur;
            Color lijnkleur;
            int breedte;
            int hoogte;

            public void init() {
                opvulkleur = Color.MAGENTA;
                lijnkleur = Color.BLACK;
                breedte = 200;
                hoogte = 100;
            }

            public void paint(Graphics g) {
                g.drawLine(100, 75, 300, 75);

                g.drawRect(100, 100, breedte, hoogte);

                g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

                g.setColor(opvulkleur);
                g.fillRect(315, 100, breedte, hoogte);

                g.setColor(lijnkleur);
                g.drawOval(315, 100, breedte, hoogte);

                g.setColor(opvulkleur);
                g.fillOval(315, 225, breedte, hoogte);

                g.setColor(lijnkleur);
                g.drawOval(530,100, breedte, hoogte);
                g.setColor(opvulkleur);
                g.fillArc(530, 100, breedte, hoogte, 0, 45);

                g.setColor(lijnkleur);
                g.drawOval(575, 225, 100, 100);

                g.drawString("Lijn", 190, 90);
                g.drawString("Rechthoek", 175, 215);
                g.drawString("Afgeronde rechthoek", 150, 340);

                g.drawString("Gevulde rechthoek met ovaal", 345, 215);
                g.drawString("Gevulde ovaal", 375, 340);

                g.drawString("Taartpunt met ovaal eromheen", 540, 215 );
                g.drawString("Cirkel", 610, 340 );


            }
        }
