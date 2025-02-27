package lab2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        System.out.println(Arrays.toString(findMaxElement(twoDimArray)));
    }
    public static int[] findMaxElement(int[][] arr){
        int[] mx = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int currentMax = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                currentMax = Math.max(currentMax, arr[i][j]);
            }
            mx[i] = currentMax;
        }
        return mx;
    }
}
