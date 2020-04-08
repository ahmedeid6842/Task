package decoratorPattern;

public class Restaurant {

	public static void main(String[] args) {
	      //Decorator  Task 
              //BY : Ahmed Mahmoud Eid 
              //Section 1
		Pizza pizza2 = new Tuna();
		pizza2 = new Tomato(pizza2);
		pizza2 = new Pepper(pizza2);
                pizza2=new Mashrom(pizza2);
                pizza2=new Olive(pizza2);
		System.out.println(pizza2.getDescription()
				+ " $" + pizza2.cost());
	}

}
