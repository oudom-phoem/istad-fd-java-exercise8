package view;

import controller.ProductController;
import model.Product;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class UI {
    private static final ProductController productController = new ProductController();

    private static void option() {
        while (true) {
        System.out.print("[+] Insert option: ");
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1 -> System.out.println(productController.getAllProducts());
            case 2 -> {
                System.out.print("[+] Enter uuid to search: ");
                String uuid = new Scanner(System.in).next();
                try {
                    Product product = productController.searchProductByUuid(uuid);
                    System.out.println("Found product: " + product);
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }
            }
            case 3 -> {
                System.out.println("Thank you for using this app!");
                return;
            }
            default -> System.out.println("[!] Invalid option");
        }
        }
    }

    public static void home() {
        System.out.println("""
                ==================================
                        Welcome to my Mart
                ==================================
                1. View All Products
                2. Search Products by uuid
                3. Exit
                ----------------------------------
                """);

        option();

    }
}
