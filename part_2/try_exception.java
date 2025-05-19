package part_2;

public class try_exception {
    public static void main(String[] args){
        int i = 9;        // this is a normal statement
        int j = 0;
        int nums[] = new int[5];   
        String str = null;



        try{
            j=18/i;       //this is a critical statement
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(str.length());

        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide By Zero!!");
        }
        catch(ArrayIndexOutOfBoundsException k){
             System.out.println("Stay In Your Limit!!");
        }
        catch(Exception e){
            System.out.println("Some Unknown Error:" + e);
        }
        if (j == 0){
            System.out.println("Well it didnt work as expected!!");
        }
        else{
            System.out.println("Value of j :" + j);
            System.out.println("Thank you sir!!");
        
        }
    }
}
