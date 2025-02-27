package lab2;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubstr {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scanner.nextLine();
        System.out.println("Самая длинная уникальная подстрока: " + longestUniqueSubstring(str));
    }
    public static String longestUniqueSubstring(String s) {
        int maxLength = 0;
        int start = 0; // Начало текущего окна
        int end = 0;   // Конец текущего окна
        String longestSubstring = "";
        HashSet<Character> uniqueChars = new HashSet<>();

        while (end < s.length()) {
            char currentChar = s.charAt(end);

            // Если текущий символ уже в множестве, удаляем символы слева до тех пор, пока не удалим повторяющийся
            while (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(s.charAt(start));
                start++;
            }

            // Добавляем текущий символ в множество
            uniqueChars.add(currentChar);

            // Обновляем наибольшую длину и саму подстроку
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = s.substring(start, end + 1);
            }
            end++;
        }

        return longestSubstring;
    }
}
