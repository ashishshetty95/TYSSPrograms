package OOPS;

public abstract class RealMe implements MobilePhone {
	String brand="Realme";
	
	public abstract void infrared();
	public abstract void realMeShare();
	public abstract void wireLessCharging();
	
	
	
	@Override
	public void call() {
		System.out.println("Calling feature: YES");
		
	}
	@Override
	public void messaging() {
		System.out.println("Messaging feature: YES");
	}
	@Override
	public void camera() {
		System.out.println("Camera: YES");
		
	}
	@Override
	public void bluetooth() {
		System.out.println("Bluetooth: YES");
	}
}
