import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Calculator.getPeopleCount(scanner);
        Calculator.addProducts(scanner);
        scanner.close();
        System.out.println(Calculator.listOfProducts);
        System.out.println("\nИтого c каждого: " +
                Formatter.getPriceWithRubles(Calculator.totalPrice / countPeople));
    }
}