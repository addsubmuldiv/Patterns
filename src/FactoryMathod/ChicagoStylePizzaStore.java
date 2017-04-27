package FactoryMathod;

/**
 * Created by Lighters_c on 2017/4/27.
 */
public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if(type.equals("veggie"))
            return new ChicagoStylePepperoniPizza();
        else
            return null;
    }
}
