package day10;

public class SingletoTest2 {
    Order order1 = Order.getInstance();
    Order order2 = Order.getInstance();

}
class Order{
    private Order(){}
    private static Order instance = null;
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }

}

