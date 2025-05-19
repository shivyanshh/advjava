package part_2;

import java.io.IOError;
import java.io.IOException;

public class User_Input {
    public static void main(String[] args){
        System.out.println("Write A Number Bitch:");
        //int num = System.in.read();   // it will always show error cause it can have I/O exception either u can throw this from main to JVM 
        // but always surround it with try and catch
        try{
            int num = System.in.read();
            System.out.println("Value Of num:"+ num );  //this gives only ascii value of that
        }
        catch(IOException e){
            System.out.println("Sir I Think It's An IOException");
        }
        
    }
}
