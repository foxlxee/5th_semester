package lab2;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -9};
        System.out.println(calculateMaxSubArraySum(arr));
    }
    public static int calculateMaxSubArraySum(int[] arr){
        int mxSum = 0;
        int curSum = 0;
        int startIndex, endIndex = 0;
        while (endIndex < arr.length){
            curSum += arr[endIndex];
            if (curSum > mxSum){
                mxSum = curSum;
            }
            if (curSum < 0){
                curSum = 0;
                startIndex = endIndex + 1;
            }
            endIndex += 1;
        }
        return mxSum;
    }

}
