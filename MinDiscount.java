import java.util.*;

public class MinDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = Integer.parseInt(sc.nextLine());

        int minDiscount = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item (name,price,discount%): ");
            String input = sc.nextLine();

            String[] parts = input.split(",");

            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int discountPercent = Integer.parseInt(parts[2]);

            int discountAmount = (price * discountPercent) / 100;

            if (discountAmount < minDiscount) {
                minDiscount = discountAmount;
                result.clear();
                result.add(name);
            } else if (discountAmount == minDiscount) {
                result.add(name);
            }
        }

        System.out.println("\nItem(s) with minimum discount:");
        for (String item : result) {
            System.out.println(item);
        }

        sc.close();
    }
}