package FactoryMathod;

/**
 * Created by Lighters_c on 2017/4/27.
 */
public class PizzaTestDrive {
    public static void main(String[] args)
    {
        PizzaStore nyStore=new NYStylePizzaStore();
        PizzaStore chicagoStore=new ChicagoStylePizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza=chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
}
