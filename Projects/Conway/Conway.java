import javax.swing.*;

public class Conway {
    
    public static void main(String[] args) {
        JFrame conway = new JFrame("Conway's Game of Life");
        Grid grid = new Grid(800, 600, 10);
        
        conway.add(grid);
        grid.repaint();
        
        conway.pack();
        conway.setResizable(false);
        conway.setLocationRelativeTo(null);
        conway.setVisible(true);
        conway.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}