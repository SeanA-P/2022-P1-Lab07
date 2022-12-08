import java.awt.*;
import java.applet.*;

public class Car{
    public static void drawBase(Graphics g){
        g.setColor(new Color(165,31,27));
        g.fillRect(150,350,700,200);

        g.setColor(new Color(135,135,135));
        g.fillArc(190,487,125,125,0,180);
        g.fillArc(688,487,125,125,0,180);
    }
    public static void drawTop(Graphics g){
        g.setColor(new Color(165,31,27));
        g.fillRect(150,250,500,100);

    }
    public static void drawWindow(Graphics g){
        g.setColor(new Color(78,213,237));
        g.fillRect(545,260,90,90);
    }
    public static void drawWheels(Graphics g){
        g.setColor(new Color(0,0,0));
        g.fillOval(200,500,100,100);
        g.fillOval(700,500,100,100);

        g.setColor(new Color(156,156,156));
        g.fillOval(225,525,50,50);
        g.fillOval(725,525,50,50);
    }

}
