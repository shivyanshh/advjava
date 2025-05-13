package single_topics;
abstract class Car{                //abstract means only imaginable 
    public abstract void drive();  //a idea of car cant drive
    public void playMusic(){       //an abstract method can only be inside an abstract class
        System.out.println("play music");
    }

    public abstract void fly();
}
class WagonR extends Car{ //it will show error if u inherited an abstract class and didnt declared the abstract methods in it...
    public void drive(){
        System.out.println("driving...");
    }                                                   //concrete class
    public void fly(){
        System.out.println("its flying");
    }
}

public class abstract_keyword {
    public static void main(String[] args){
        // Car obj = new Car();                cannot create an object of car but u can use its reference
        WagonR obj = new WagonR();
        obj.drive();

        obj.playMusic();
    }
}
