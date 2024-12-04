import java.awt.*;

public class Pipe {
    int boardWidth = 360;

    int pipeX = boardWidth;
    int pipeY = 0;
    int pipeWidth = 64; // scaled by 1/6
    int pipeHeight = 512;

    int x = pipeX;
    int y = pipeY;
    int width = pipeWidth;
    int height = pipeHeight;
    Image img;
    boolean passed = false;

    Pipe(Image img) {
        this.img = img;
    }
}
