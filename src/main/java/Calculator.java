import java.util.Scanner;

public class Calculator {

    static double totalPrice = 0;
    static String listOfProducts = "\nДобавленные товары:";

    public static void addProducts(Scanner scanner) {
        String nextEnter = "";
        while (!nextEnter.equalsIgnoreCase("Завершить")) {
            String productName = "";
            double price = Integer.MIN_VALUE;

            System.out.println("\nВведите название товара:");
            while (productName.equals("")){
                if(scanner.hasNextInt()){
                    System.out.println("Название не может быть числом");
                    scanner.nextInt();
                    scanner.nextLine();
                    continue;
                } else if (scanner.hasNextDouble()) {
                    System.out.println("Название не может быть дробью");
                    scanner.nextDouble();
                    scanner.nextLine();
                    continue;
                }
                productName = scanner.nextLine();
            }

            System.out.println("\nВведите цену в рублях " +
                    "или с копейками через \",\" - например: 1010,23");
            while (price <= 0) {
                if (!scanner.hasNextDouble()) {
                    System.out.println("Цена должна должна быть числом. Дробная часть через \",\"");
                    scanner.next();
                    continue;
                }

                price = scanner.nextDouble();
                if (price <= 0){
                    System.out.println("Цена должна должна быть больше 0");
                }
            }

            System.out.println("Вы добавили товар: " + productName);
            listOfProducts += "\n" + productName;
            totalPrice += price;

            System.out.println("""
                    Для ввода следующего товара - введите любой символ или слово.
                    Для завершения подсчета введите: \"Завершить\"""");
            nextEnter = scanner.next();
        }
    }

    public static int getPeopleCount(Scanner scanner) {
        int countPeople = Integer.MIN_VALUE;
        System.out.println("На сколько человек необходимо разделить счёт?");
        while (countPeople <= 1) {
            if (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите целое число.");
                scanner.next();
                continue;
            }
            countPeople = scanner.nextInt();
            if (countPeople <= 1) {
                System.out.println("Число человек должно быть больше 1.");
            }
        }

        return countPeople;
    }
}