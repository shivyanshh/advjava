package single_topics;

public class need_interface {
    public static void main(String[] args){
        computer lap = new laptop();
        developer shivyansh = new developer();
        computer desk = new Desktop();
        shivyansh.devApp(lap);
        shivyansh.devApp(desk);

    }
} 
interface computer{
    void code();
}
class developer{
    public void devApp(computer lap){
        lap.code();}
    }
class Desktop implements computer{
    public void code(){
        System.out.println("code, compile, run, faster!!");
    }
}

class laptop implements computer{
    public void code(){
        System.out.println("code, compile, run");   
    }
}