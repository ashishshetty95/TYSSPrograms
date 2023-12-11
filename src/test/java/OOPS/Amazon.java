package OOPS;

import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void display() {
		MotoRazr40 moto=new MotoRazr40();
		System.out.println("Brand: "+moto.brand);
		System.out.println(moto.model);
		moto.price();
		System.out.println(moto.OS);
		moto.androidVersion();
		moto.colour();
		moto.camera();
		moto.primaryCamera();
		moto.secondaryCamera();
		moto.ram();
		moto.storage();
		moto.processor();
		moto.charging();
		moto.call();
		moto.messaging();
		moto.bluetooth();
		System.out.println(moto.SCREENTYPE);
		moto.screenSize();
		moto.foldable();
		moto.gestures();
		moto.voiceUnlock();
		
		System.out.println("***************************************");
		
		Narzo60X realme=new Narzo60X();
		System.out.println("Brand: "+realme.brand);
		System.out.println(realme.model);
		realme.price();
		System.out.println(realme.OS);
		realme.androidVersion();
		realme.colour();
		realme.camera();
		realme.primaryCamera();
		realme.secondaryCamera();
		realme.ram();
		realme.storage();
		realme.processor();
		realme.charging();
		realme.call();
		realme.messaging();
		realme.bluetooth();
		System.out.println(realme.SCREENTYPE);
		realme.screenSize();
		realme.infrared();
		realme.wireLessCharging();
		realme.realMeShare();
	}
}
