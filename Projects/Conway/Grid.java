import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Grid extends JPanel {

    private int width, height, cellSize, xCount, yCount;
    private Cell[][] cells;
    
    public Grid(int width, int height, int cellSize) {
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
        
        while (this.width % this.cellSize != 0) {
            this.width++;
        }
        while (this.height % this.cellSize != 0) {
            this.height++;
        }
        
        this.xCount = this.width / this.cellSize;
        this.yCount = this.height / this.cellSize;
        
        this.cells = new Cell[this.yCount][this.xCount];
        
        for (int y = 0; y < cells.length; y++) {
            for (int x = 0; x < cells[y].length; x++) {
                cells[y][x] = new Cell(x * this.cellSize, y * this.cellSize, this.cellSize);
            }
        }
        
        setPreferredSize(new Dimension(this.width, this.height));
    }
}
