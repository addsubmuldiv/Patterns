package FactoryMathod;

/**
 * Created by Lighters_c on 2017/4/27.
 */
public class NYStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new NYStyleCheesePizza();
        else if(type.equals("veggie"))
            return new NYStyleVeggiePizza();
        else
            return null;
    }
}
