package OOPS;

public class Narzo60X extends RealMe {
	
	String model="RealMe Narzo60X";
	@Override
	public void charging() {
		System.out.println("USB type port");
	}

	@Override
	public void ram() {
		System.out.println("RAM: 6 GB");
	}

	@Override
	public void storage() {
		System.out.println("Storage: 128 GB");
	}

	@Override
	public void processor() {
		System.out.println("Processor: MediaTek 650");
	}

	@Override
	public void androidVersion() {
		System.out.println("Android version: Android 12.0");
	}

	@Override
	public void colour() {
		System.out.println("Colour: Stellar Green");
	}

	@Override
	public void screenSize() {
		System.out.println("Screen size: 6.7 inch");
	}

	@Override
	public void price() {
		System.out.println("Price: Rs. 14999");
	}

	@Override
	public void primaryCamera() {
		System.out.println("Primary Camera: 50 MP");
	}

	@Override
	public void secondaryCamera() {
		System.out.println("Secondary camera: 20 MP");
	}

	@Override
	public void infrared() {
		System.out.println("Infrared Sensor: YES");
	}

	@Override
	public void realMeShare() {
		System.out.println("RealMe share: YES");
	}

	@Override
	public void wireLessCharging() {
		System.out.println("wireless charging: YES");
	}

}
