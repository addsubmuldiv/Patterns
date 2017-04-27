package FactoryMathod;

import java.util.ArrayList;

/**
 * Created by Lighters_c on 2017/4/27.
 */
public abstract class Pizza {
   String name;
   String dough;
   String sauce;
   ArrayList toppings= new ArrayList();

   void prepare()
   {
       System.out.println("Preparing "+name);
       System.out.println("Tossing dough…");
       System.out.println("Adding sauce…");
       System.out.println("Adding toppings: ");
       for (Object topping : toppings) {
           System.out.println("   " + topping);
       }
   }

   void bake()
   {
       System.out.println("Bake for 25 minutes at 350");
   }

   void cut()
   {
       System.out.println("Cutting the pizza into diagonal slices");
   }

   void box()
   {
       System.out.println("Place pizza in official PizzaStore box");
   }

   public String getName()
   {
        return name;
   }
}

class NYStyleCheesePizza extends Pizza
{
    NYStyleCheesePizza()
    {
        name="NY Style sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

class NYStyleVeggiePizza extends Pizza
{
    NYStyleVeggiePizza()
    {
        name="NY Style sauce and Veggie Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}




class ChicagoStyleCheesePizza extends Pizza
{
    ChicagoStyleCheesePizza()
    {
        name="Chicago Style Deep Dish Cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}


class ChicagoStylePepperoniPizza extends Pizza {
    ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
