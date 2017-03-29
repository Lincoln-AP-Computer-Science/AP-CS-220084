import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
        
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                repaint();
            }
        });
        
        setPreferredSize(new Dimension(this.width, this.height));
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                g.setColor(new Color(0, 0, 0));
                g2.draw(cell);
                if (cell.contains(subtract(MouseInfo.getPointerInfo().getLocation(), this.getLocationOnScreen()))) {
                    g.setColor(new Color(128, 128, 128));
                } else {
                    g.setColor(new Color(255, 255, 255));
                }
                g2.fill(cell);
            }
        }
    }
    
    private Point subtract(Point p1, Point p2) {
        return new Point(p1.x - p2.x, p1.y - p2.y);
    }
}