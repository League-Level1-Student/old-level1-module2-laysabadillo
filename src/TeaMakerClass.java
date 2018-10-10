
public class TeaMakerClass {
	public static void main(String[] args) {
	
		TeaBag bag = new TeaBag(TeaBag.CHAMOMILE);
		
		Kettle kettle = new Kettle();
		System.out.println(kettle.getWater());
		kettle.boil();
		
		Cup tea = new Cup();
		tea.makeTea(bag, kettle.getWater());

	}
}
