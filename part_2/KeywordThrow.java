package part_2;

class Myexception extends Exception{
    public Myexception(String string){
        super(string);
    }
}
public class KeywordThrow {
    public static void main(String[] args){
        int i = 18;        // this is a normal statement
        int j = 0;
        try{
            j=18/i;       //this is a critical statement

            if (j==0){
                throw new ArithmeticException("I dont want to print zero");  //throwing an exception 
            }
            else if (j==1){
                throw new Myexception("this is only one!");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Myexception e){
            System.out.println("im not printing 1 too... hehe " + e);
        }
        catch(Exception e){
            System.out.println("Some Unknown Error:" + e);
        }
        if (j == 0){
            System.out.println("Well it didnt work as expected!!");
        }
        else if (j == 1){
            System.out.println("Well I was kidding the answer is 1.");
        }
        else{
            System.out.println("Value of j :" + j);
            System.out.println("Thank you sir!!");
        
        }
    }
}
