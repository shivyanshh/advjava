package single_topics;
enum Laptop{
    macbook(2000), xps(2200), surface , thinkpad(1800);
    private int price;

    

    private Laptop() { //default constructor
        price = 500;   //for those who dont have price
    }

    private Laptop(int price) {//parameterised constructor
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
public class enumclass {
    public static void main(String[] args){
        // Laptop lap = Laptop.macbook;
        // System.out.println(lap + ":"+ lap.getPrice());

        for (Laptop lap : Laptop.values()){
            System.out.println(lap + ":"+ lap.getPrice());
        }


    }
}
