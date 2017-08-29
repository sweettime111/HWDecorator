
public class Medium extends Seasoning {
	Menu menu;
	public Medium(Menu menu){
			this.menu = menu;
	}
	
	@Override
	public String getDescription() {
		return menu.getDescription()+", Medium";
	}
	public double cost(){
		return 10.0 + menu.cost();
	}

}
