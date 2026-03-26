import java.util.*;
public class TyersCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of dealerships: ");
        int dealerships = sc.nextInt();

        for (int i = 1; i <= dealerships; i++) {
            System.out.print("Enter cars and bikes for dealership " + i + ": ");

            int cars = sc.nextInt();
            int bikes = sc.nextInt();

            int tyres = (cars * 4) + (bikes * 2);

            System.out.println("Total tyres: " + tyres);
        }

        sc.close();
    }
}
