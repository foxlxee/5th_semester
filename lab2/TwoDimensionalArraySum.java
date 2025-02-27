package lab2;

public class TwoDimensionalArraySum {
    public static void main(String[] args) {
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        System.out.println(calculateTwoDimensionalArraySum(twoDimArray));
    }
    public static int calculateTwoDimensionalArraySum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
