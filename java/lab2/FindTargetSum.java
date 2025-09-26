package lab2;

import java.util.HashMap;
import java.util.Map;

public class FindTargetSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTargetSum(arr, target);
        // Вывод результата
        if (result != null) {
            System.out.println("Пара с суммой " + target + ": [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Пара с суммой " + target + " не найдена.");
        }
    }

    public static int[] findTargetSum(int[] arr, int targetSum) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer j = indexMap.get(targetSum - arr[i]);
            if (j != null) {
                // разница в мапе найдена - кидаем элементы
                    return new int []{arr[i], arr[j]};
            } else {
                // разница не найдена - добавляем её в мапу
                indexMap.put(arr[i], i);
            }
        }
        return null;
    }
}
