package lab2;

import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int [][] matrix = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int[][] rotatedMatrix = rotateRight(matrix);

        // Выводим результат
        System.out.println("Повернутая матрица на 90 градусов против часовой стрелки:");
        for (int[] row : rotatedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] rotateRight (int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }
}
