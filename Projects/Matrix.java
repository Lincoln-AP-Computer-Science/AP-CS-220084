import java.util.*;

public class Matrix {
    
    private double[][] matrix;
    
    public Matrix(int size, double... numbers) {
        this.matrix = new double[size][size];
        int index = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.matrix[row][col] = numbers[index];
                index++;
            }
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < this.matrix.length; col++) {
                if (col == 0) output += "|";
                output += this.matrix[row][col];
                if (col == matrix.length - 1) output += "|";
            }
        }
        return output;
    }
}
