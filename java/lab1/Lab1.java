import java.util.Scanner;
public class Lab1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1(){
        System.out.println("Задание 1)");
        System.out.println("Введите число для поиска кол-ва шагов сиракузской пос-ти:");

        int a = scanner.nextInt();
        int count = 0;

        while(a != 1){
            count++;
            if(a % 2 == 0){
                a = a / 2;
            }else{
                a = 3 * a + 1;
            }
        }
        System.out.println("Кол-во шагов:");
        System.out.println(count);
    }

    public static void task2(){
        System.out.println("Задание 2)");
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (i % 2 == 0) {
                sum += a;
            }else{
                sum -= a;
            }
        }
        System.out.println("Ваша сумма:");
        System.out.println(sum);
    }
    public static void task3(){
        System.out.println("Задание 3)");

        System.out.println("Введите координаты клада (x, y)");
        System.out.println("Координата по х: ");
        int targetX = scanner.nextInt();
        System.out.println("Координата по y:");
        int targetY = scanner.nextInt();
        scanner.nextLine(); // Пропустить перевод строки
        int currentX = 0, currentY = 0;
        int steps = 0;
        while (true) {
            String direction = scanner.nextLine();
            if (direction.equals("стоп")) {
                break;
            }
            int distance = scanner.nextInt();
            scanner.nextLine(); // Пропустить перевод строки
            switch (direction) {
                case "север":
                    currentY += distance;
                    break;
                case "юг":
                    currentY -= distance;
                    break;
                case "восток":
                    currentX += distance;
                    break;
                case "запад":
                    currentX -= distance;
                    break;
            }
            steps++;
            if (currentX == targetX && currentY == targetY) {
                break;
            }
        }
        System.out.println(steps);
    }
    public static void task4(){
        System.out.println("Задание 4)");

        int roadCount = scanner.nextInt();
        int maxRoad = 0;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 1; i <= roadCount; i++) {
            int tunnelCount = scanner.nextInt();
            int minHeight = Integer.MAX_VALUE;

            for (int j = 0; j < tunnelCount; j++) {
                int height = scanner.nextInt();
                if (height < minHeight) {
                    minHeight = height;
                }
            }

            if (minHeight > maxHeight) {
                maxHeight = minHeight;
                maxRoad = i;
            }
        }
        System.out.println(maxRoad + " " + maxHeight);
    }
    public static void task5(){
        System.out.println("Задание 5)");
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        int mul = 1;
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += digit;
            mul *= digit;
            n = n / 10;
        }
        if (mul % 2 == 0 && sum % 2 == 0){
            System.out.println("Число дважды четное");
        }else{
            System.out.println("Число не является дважды четным");
        }

    }
}