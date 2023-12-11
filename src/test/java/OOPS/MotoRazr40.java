package OOPS;

public class MotoRazr40 extends Moto {
	
	String model="Moto Razr40";

	@Override
	public void charging() {
		System.out.println("C-type Port");
	}

	@Override
	public void ram() {
		System.out.println("Ram: 8 GB");
	}

	@Override
	public void storage() {
		System.out.println("Storage: 256 GB");
	}

	@Override
	public void processor() {
		System.out.println("Processor: Snapdragon 7 Gen 1 Mobile Platform");
	}

	@Override
	public void androidVersion() {
		System.out.println("Android version: Android 13.0");
	}

	@Override
	public void colour() {
		System.out.println("Colour: Black");
		
	}

	@Override
	public void screenSize() {
			System.out.println("Screen size: 6.9 inch");
	}

	@Override
	public void price() {
		System.out.println("Price: Rs. 49999");
	}

	@Override
	public void primaryCamera() {
		System.out.println("Primary camera: 64 MP");
		
	}

	@Override
	public void secondaryCamera() {
		System.out.println("Secondary camera: 32 MP");
	}

	@Override
	public void gestures() {
		System.out.println("Moto gestures: YES");
	}

	@Override
	public void foldable() {
		System.out.println("Foldable phone: YES");
	}

	@Override
	public void voiceUnlock() {
		System.out.println("Voice Unlock feature is present");
	}

}
