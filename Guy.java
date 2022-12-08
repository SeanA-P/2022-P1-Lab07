import java.awt.*;
import java.applet.*;

public class Guy {
    public static void drawTorso(Graphics g){
        g.setColor(new Color(37,172,1));
        g.fillRect(560,310,30,40);
    }
    public static void drawShirt(Graphics g){
        g.setColor(new Color(241,194,125));
        g.fillOval(553,275,45,45);
    }
    public static void drawEye(Graphics g){
        g.setColor(new Color(0,0,0));
        g.fillOval(580,280,10,15);
    }
}
