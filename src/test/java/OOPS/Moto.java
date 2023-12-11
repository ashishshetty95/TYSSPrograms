package OOPS;

public abstract class Moto implements MobilePhone{
	String brand="Moto";
	
	public abstract void gestures();
	public abstract void foldable();
	public abstract void voiceUnlock();
	
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
