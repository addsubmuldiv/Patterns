package FactoryMathod;

/**
 * Created by Lighters_c on 2017/4/27.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String pizzaName)
    {
        Pizza pizza;

        pizza = createPizza(pizzaName);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
