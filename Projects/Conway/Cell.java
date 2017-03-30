import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cell extends JComponent implements MouseListener {

    private Rectangle cell;
    private int x, y, size;
    private Cell[] neighbors;
    protected boolean hovered, selected;
    
    public Cell(int x, int y, int size) {
        this.cell = new Rectangle(x, y, size, size);
        this.neighbors = new Cell[8];
        addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e) {
        selected = true;
        repaint();
    }
    
    public void mouseEntered(MouseEvent e) {
        hovered = true;
        repaint();
    }
    
    public void mouseExited(MouseEvent e) {
        hovered = false;
        repaint();
    }
    
    public void mousePressed(MouseEvent e) { }
    
    public void mouseReleased(MouseEvent e) { }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        if (this.hovered) {
            g.setColor(new Color(128, 128, 128));
            g2.fill(cell);
        } else if (this.selected) {
            g.setColor(new Color(0, 0, 0));
            g2.fill(cell);
        } else {
            g.setColor(new Color(0, 0, 0));
            g2.draw(cell);
        }
    }
}
