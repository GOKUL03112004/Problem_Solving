package CCT.Summa;

import java.util.Scanner;

public class InventoryValueCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalValue = 0;

        System.out.println("Enter product details (product_id, \"product name\", quantity, price). Enter 'done' to finish:");

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();

            if (line.equalsIgnoreCase("done")) {
                break;
            }
            String[] parts = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            if (parts.length != 4) {
                System.out.println("Invalid input, please enter exactly 4 fields.");
                continue;
            }

            String productId = parts[0].trim();
            String productName = parts[1].trim().replaceAll("^\"|\"$", "");
            int quantity = Integer.parseInt(parts[2].trim());
            double price = Double.parseDouble(parts[3].trim());

            double productValue = quantity * price;
            totalValue += productValue;
        }

        System.out.println("Total Inventory Value: " + totalValue);
    }
}
