
public class Spacial extends Seasoning {
	Menu menu;
	public Spacial(Menu menu){
			this.menu = menu;
	}
	
	@Override
	public String getDescription() {
		return menu.getDescription() + " , Spacial";
	}
	public double cost(){
		return 20.50 + menu.cost();
	}

}
