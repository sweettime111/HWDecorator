
public class Steak
{
Menu beverage;
	public static void main(String[] args) {
		Menu b1 = new Pig();
		System.out.println(b1.getDescription() +  " $ "+ b1.cost());
		
		Menu b2 = new Chicken();
		b2 = new Spacial(b2);
		
		System.out.println(b2.getDescription() +  " $ "+ b2.cost());
		
		Menu b3 = new Fish();
		b3 = new Medium(b3);
		
		System.out.println(b3.getDescription() +  " $ "+ b3.cost());
		
		Menu b4 = new Beef();
		b4 = new Medium(b4);
		b4 = new Spacial(b4);
		System.out.println(b4.getDescription() +  " $ "+ b4.cost());
		
	}

}
