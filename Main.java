import javafx.scene.layout.BackgroundFill;

import java.awt.*;
import java.applet.*;


public class Main extends Applet{
    public void paint(Graphics g){
        Background.drawSky(g);
        Background.drawRoad(g);
        Background.drawLines(g);

        Car.drawBase(g);
        Car.drawTop(g);
        Car.drawWindow(g);
        Car.drawWheels(g);

        Guy.drawTorso(g);
        Guy.drawShirt(g);
        Guy.drawEye(g);
    }
}