package part_2;

import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args){
        System.out.println("Enter A Number:");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(num);
        obj.close();
    }
}
