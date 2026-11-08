package project2.src;

import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class alienInvasion {

    public static void main(String[] args) {

        CanvasAPI canvas = Graphics.createCanvas(
                800, 600, "Space Invasion"
        );
        canvas.setBackgroundColor(Color.BLACK);

        PainterAPI painter = canvas.getPainter();

        painter.setSpeed(0);

        project2.src.spaceInvasion scene = new project2.src.spaceInvasion(painter);

        scene.drawDecorations();


        scene.drawUFO(-260, 220, 120, Color.MAGENTA);
        scene.drawUFO(700, 100, 180, Color.GREEN);

        scene.drawAlien(-220, -220, 80, Color.GREEN);
        scene.drawAlien(700, -220, 50, Color.BLUE);
        scene.drawPlanet(300, 100 ,65, Color.MAGENTA);


    }
}
