package single_topics;
class parent{
    int age;
    public void show(){
        System.out.println("in parent show");
    }
    class child{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class inner_class {
    public static void main(String[] args){
        parent obj = new parent();  //u cant accesses age and method show() without object of parent
        obj.show();
        
        parent.child obj2 = obj. new child();  // likewise u cant accesses innerclass without the parent object
        obj2.config();
    }
}
