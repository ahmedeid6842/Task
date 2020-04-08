package decoratorPattern;

public class Mashrom extends ToppingDecorator{

	Pizza pizza;
	
	public Mashrom(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,With Mashrom";
	}

	@Override
	public double cost() {
		return 0.10 + pizza.cost();
	}

}
