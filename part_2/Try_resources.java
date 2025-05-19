package part_2;

import java.util.Scanner;

public class Try_resources {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            System.out.println("Write something:");
            scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println(str);
        } catch (Exception e) {
            System.out.println("We are truly sorry for: " + e);
        } finally {
            if (scanner != null) {
                scanner.close();  // ✅ Safe to close
            }
            System.out.println("THANK YOU FOR USING OUR SOFTWARE");
        }
    }
}
