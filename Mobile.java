package week1.day1;

public class Mobile {
	
	
	String mobileModel ="Oneplus 6T";
	float mobileWeight = 13.2F;
	boolean fullCharged = true;
	int mobileCost = 13000;
	
	public void mobileFeatures() {
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(fullCharged);
		System.out.println(mobileCost);
	}
	
	/*
	 * public void makeCall() { System.out.println("Make Call");
	 * 
	 * } public void sendMsg() { System.out.println("Send Msg"); }
	 */
	public static void main(String[] args) {
		Mobile myMob = new Mobile();
		myMob.mobileFeatures();
	}
}
