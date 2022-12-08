import java.awt.*;
import java.applet.*;

public class Background{
    public static void drawSky(Graphics g){
        g.setColor(new Color(42,219,255));
        //light blue

        g.fillRect(0,0,1000,400);
    }
    public static void drawRoad(Graphics g){
        g.setColor(new Color(107,107,107));
        //gray

        g.fillRect(0,400,1000,375);
    }
    public static void drawLines(Graphics g){
        g.setColor(new Color(255,255,0));
        //yellow

        g.fillRect(0,414, 1000,20);
        g.fillRect(0,445, 1000,20);
    }
}