package single_topics;

//enum

public class enumeration {
    public static void main(String[] args){
        int i = 5;
        Status s = Status.Running;// creating object of Status
        Status[] n = Status.values(); //it gives value in array
        System.out.println(s);
        //System.out.println(n[3]);
        for(Status y : n){
            System.out.println(y +":"+y.ordinal());
        }
    }
}
enum Status{ //status is a class name and enum is like a class where u hold constants
    Running, Failed, Pending, Success;
}
