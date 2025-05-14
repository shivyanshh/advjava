package single_topics;
class parent {
    public void show(){
        System.out.println("in parent show");
    }
}

public class anonymousClass {
    public static void main(String[] args) {
        parent obj = new parent(){
            public void show(){
                System.out.println("in new show");      //when u want to use only once so why create multiple class 
                // this doesnt have a name when compiled as u can see its showing "anonymousClass$1"
            }
        };
        obj.show();
    }


}
