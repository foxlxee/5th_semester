package lab2;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int [][] matrix = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int[][] rotatedMatrix = rotateLeft(matrix);

        // Выводим результат
        System.out.println("Повернутая матрица на 90 градусов против часовой стрелки:");
        for (int[] row : rotatedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] rotateLeft (int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];

        // Транспонируем матрицу (меняем местами строки и столбцы)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[cols - 1 - j][i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }
}
