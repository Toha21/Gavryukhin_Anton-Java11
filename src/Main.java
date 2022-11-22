import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\R");

        System.out.println("Введите число больше 7:");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number > 7) {
                System.out.println("Привет");

            }

            //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
            String name = "";
            System.out.print("Введите имя: ");
            if (scanner.hasNext()) {
                name = scanner.next().trim();
            }
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }


            //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
            int size = 0;
            System.out.println("Введите длину массива: ");
            size = scanner.nextInt();
            int array[] = new int[size];
            System.out.println("Введите числа на новой строке: ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < size; i++) {
                if (array[i] % 3 == 0) {
                    System.out.println("Элементы массива кратные 3: " + array[i]);
                }
            }
        }
    }
}
