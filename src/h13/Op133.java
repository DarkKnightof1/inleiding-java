package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Op133 extends Applet {

    Button button1, button2;
    int aantal;
    public void init() {
        button1 = new Button("Ok");
        button1.addActionListener( new KnopListener1());
        add(button1);
        button2 = new Button("Ok");
        button2.addActionListener( new KnopListener2());
        add(button2);
        aantal = 0;


    }

    public void paint(Graphics g) {
        if (aantal > 1) {
            tekenMuur1(g, 10, 20, 40, 20);
        }
        if (aantal == 1){
            tekenMuur2(g, 10, 20, 40, 30);
        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal = 2;
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal = 1;
            repaint();
        }
    }

    void tekenMuur1(Graphics g, int x1, int y1, int x2, int y2) {
        int getal;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.red);
            g.fillRect(x1, y1, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1, x2, y2);
        }
        x1 = 0;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.red);
            g.fillRect(x1, y1 + 20, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 20, x2, y2);
        }
        x1 = 10;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.red);
            g.fillRect(x1, y1 + 40, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 40, x2, y2);
        }
        x1 = 0;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.red);
            g.fillRect(x1, y1 + 60, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 60, x2, y2);
        }
    }

    void tekenMuur2(Graphics g, int x1, int y1, int x2, int y2) {
        int getal;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.gray);
            g.fillRect(x1, y1, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1, x2, y2);
        }
        x1 = 0;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.gray);
            g.fillRect(x1, y1 + 30, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 30, x2, y2);
        }
        x1 = 10;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.gray);
            g.fillRect(x1, y1 + 60, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 60, x2, y2);
        }
        x1 = 0;
        for (getal = 0; getal < 10; getal++) {
            x1 += 40;
            g.setColor(Color.gray);
            g.fillRect(x1, y1 + 90, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1 + 90, x2, y2);
        }
    }
}

