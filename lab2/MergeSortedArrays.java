package lab2;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Пример использования
        int[] arr1 = {1, 3, 5, 7, 48};
        int[] arr2 = {2, 4, 8, 31};

        // Объединяем два отсортированных массива
        int[] result = mergeSortedArrays(arr1, arr2);

        // Выводим результат
        System.out.println("Объединенный отсортированный массив: " + Arrays.toString(result));
    }
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int currentArr1Index = 0;
        int currentArr2Index = 0;
        int currentIndex = 0;
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];

        while (currentArr1Index < length1 && currentArr2Index < length2){
            if (arr1[currentArr1Index] < arr2[currentArr2Index]){
                mergedArray[currentIndex] = arr1[currentArr1Index];
                currentArr1Index++;
            }else{
                mergedArray[currentIndex] = arr2[currentArr2Index];
                currentArr2Index++;
            }
            currentIndex++;
        }
        while (currentArr1Index < length1){
            mergedArray[currentIndex] = arr1[currentArr1Index];
            currentIndex++;
            currentArr1Index++;
        }

        while (currentArr2Index < length2){
            mergedArray[currentIndex] = arr1[currentArr2Index];
            currentIndex++;
            currentArr2Index++;
        }
        return mergedArray;
    }
}
