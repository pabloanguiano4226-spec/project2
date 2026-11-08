package project2.src;

    import java.awt.Color;
    import edu.cymbal.graphics.PainterAPI;

    class spaceInvasion {

        private PainterAPI painter;

        public spaceInvasion(PainterAPI painter) {
            spaceInvasion spaceInvasion = this;
            spaceInvasion.painter = painter;
        }


        // Method 1: Draws a circle
        public void drawCircle(int x, int y, int radius, Color color) {

            painter.liftPen();
            painter.moveTo(x, y);
            painter.setPenColor(color);
            painter.lowerPen();
            painter.circle(radius);
            painter.liftPen();

            painter.lowerPen();
            painter.startFill(color);
            painter.circle(radius);
            painter.finishFill();

            painter.liftPen();

        }

        // Method 2: Draws a rectangle
        public void drawRectangle(int x, int y, int width, int height, Color color) {
            painter.liftPen();
            painter.moveTo(x, y);
            painter.setPenColor(color);
            painter.lowerPen();
            painter.startFill(color);

            painter.forward(width);
            painter.turnRight(90);

            painter.forward(height);
            painter.turnRight(90);

            painter.forward(width);
            painter.turnRight(90);

            painter.forward(height);
            painter.turnRight(90);

            painter.finishFill();
            painter.liftPen();

        }

        // Method 3: Draws a UFO
        public void drawUFO(int x, int y, int size, Color color) {
            drawCircle(x + size / 2, y, size / 4, Color.cyan);
            drawRectangle(x, y + size / 4, size, size / 4, color);
            drawCircle(x + size / 5, y + size / 4, size / 12, Color.YELLOW);
            drawCircle(x + size / 2, y + size / 4, size / 12, Color.YELLOW);
            drawCircle(x + 4 * size / 5, y + size / 4, size / 12, Color.YELLOW);


        }

        // Method 4: Draws an alien
        public void drawAlien(int x, int y, int size, Color color) {
            {

                // Body
                drawRectangle(x, y, size / 2, size, color);

                // Legs
                drawRectangle(x, y - size, size / 5, size / 2, color);
                drawRectangle(x + size / 3, y - size, size / 5, size / 2, color);

                // Arms
                drawRectangle(x - size / 5, y - size / 5,
                        size / 5, size / 2, color);

                drawRectangle(x + size / 2, y - size / 5,
                        size / 5, size / 2, color);

                // Hands
                drawCircle(x - size / 5, y - size / 2,
                        size / 8, color);

                drawCircle(x + size / 2 + size / 5, y - size / 2,
                        size / 8, color);

                // Feet
                drawCircle(x, y - size - size / 2,
                        size / 6, color);

                drawCircle(x + size / 3, y - size - size / 2,
                        size / 6, color);

                // Head
                drawCircle(x + size / 4, y + size / 4,
                        size / 2, color);

                // Eyes
                drawCircle(x + size / 10, y + size / 4,
                        size / 10, Color.BLACK);

                drawCircle(x + 2 * size / 5, y + size / 4,
                        size / 10, Color.BLACK);
            }

        }

        // Method 5: Draws the decorations
        public void drawDecorations() {

            // Sky background
            drawRectangle(-400, 300, 1600, 900, Color.BLACK);

            // Lunar ground
            drawRectangle(-390, -250, 1600, 450, Color.LIGHT_GRAY);

            // Stars
            drawStars(1000);

            // Craters
            drawCraters(30);
        }

        // Method 6: Draws multiple stars
        public void drawStars(int count) {

            java.util.Random random = new java.util.Random();

            for (int i = 0; i < count; i++) {

                int starX = -350 + random.nextInt(2000);
                int starY = -250 + random.nextInt(1000);

                drawCircle(starX, starY, 2, Color.YELLOW);
            }
        }


        // Method 7: Draws multiple craters
        public void drawCraters(int count) {

            java.util.Random random = new java.util.Random(25);

            for (int i = 0; i < count; i++) {

                int craterX = 100 + random.nextInt(1000);
                int craterY = -200 - random.nextInt(850);
                int craterSize = 10 + random.nextInt(20);

                drawCircle(craterX, craterY, craterSize, Color.GRAY);
            }
        }

        // Method 8: Draws a planet
        public void drawPlanet(int x, int y, int size, Color color) {

            // Planet
            drawCircle(x, y, size, color);

            // Craters
            drawCircle(x - size / 3, y + size / 4,
                    size / 5, Color.DARK_GRAY);

            drawCircle(x + size / 3, y - size / 4,
                    size / 6, Color.GRAY);

            drawCircle(x, y - size / 3,
                    size / 8, Color.LIGHT_GRAY);
        }
    }

