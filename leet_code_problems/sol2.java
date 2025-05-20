package leet_code_problems;
class Solution2{
    public void addTwoNumbers(int l1[],int l2[]){
        String str1 ="";
        String str2="";
        for (int i=l1.length-1;i>=0;i--){
            String str =Integer.toString(l1[i]);
            str1 += str;
        }
        for (int i=l2.length-1;i>=0;i--){
            String str =Integer.toString(l2[i]);
            str2 += str;
        }
        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);

        int res = num1 + num2;
        String res1=Integer.toString(res);

        int[] array = new int[res1.length()];
        for(int i = res1.length()-1, j=0;i>=0;i--,j++){
            array[j]=Integer.parseInt(String.valueOf(res1.charAt(i)));
        }
        for(int n : array){
            System.out.println(n);
        }

        
    }
}
public class sol2 {
    public static void main(String[] args){
        Solution2 obj = new Solution2();
        int[] l1={1,1,1};
        int[] l2 = {1,1,1};
        obj.addTwoNumbers(l1, l2);
    }
}
