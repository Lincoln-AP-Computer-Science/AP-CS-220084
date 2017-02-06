import java.util.*;

public class Matrix {
    
    private double[][] matrix;
    private int size;
    
    public Matrix(int size, double... numbers) {
        this.size = size;
        this.matrix = new double[size][size];
        for (int row = 0, index = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.matrix[row][col] = numbers[index];
                index++;
            }
        }
    }
    
    public Matrix(int size) {
        this.size = size;
        this.matrix = new double[size][size];
    }
    
    @Override
    public String toString() {
        String output = "";
        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < this.matrix.length; col++) {
                if (col == 0) output += "| ";
                output += this.matrix[row][col] + " ";
                if (col == matrix.length - 1) output += "|\n";
            }
        }
        return output;
    }
}
