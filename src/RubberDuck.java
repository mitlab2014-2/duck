
public class RubberDuck extends Duck {
	
	public RubberDuck() {
		System.out.println("RubberDuck()");
		flyBehavior = new FlyNoWay(); 
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("a rubber duck");
	}
}
