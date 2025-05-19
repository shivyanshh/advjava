package part_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreader {
    public static void main(String[] args){
        System.out.println("Enter a number:");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        try{
            int num = Integer.parseInt(bf.readLine());
            System.out.println("Value of num:" + num);
            bf.close();

        }
        catch(IOException e){
            System.out.println("IO exception");
        }
        catch (Exception e){
            System.out.println("An Unexpected error happened :" + e);
        }

    }
}
