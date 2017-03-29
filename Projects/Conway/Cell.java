import java.awt.*;

public class Cell extends Rectangle {

    private int x, y, size;
    private Cell[] neighbors;
    
    public Cell(int x, int y, int size) {
        super(x, y, size, size);
        this.neighbors = new Cell[8];
    }
}