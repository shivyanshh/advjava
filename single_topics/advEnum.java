package single_topics;

public class advEnum {
    public static void main(String[] args){
        Status s = Status.Pending;
        switch(s){
            case Running:
                System.out.println("ALL GOOD!!");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("wait please");
                break;
            default :
                System.out.println("Done");
                break;
        }


        // if(s==Status.Running){
        //     System.out.println("ALL GOOD!!");
        // }
        // else if(s==Status.Failed){
        //     System.out.println("Try again");
        // }
        // else if(s==Status.Pending){
        //     System.out.println("wait please");
        // }
        // else{
        //     System.out.println("Done");
        // }
    }
    
}

enum Status{
    Running,Failed,Pending,Success;
}
