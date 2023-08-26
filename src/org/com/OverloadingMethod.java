package org.com;

public class OverloadingMethod {
	
	private void kjks(String name, int DoorNo) {
		System.out.println("String Name: "+name+ "\n Door No: "+ DoorNo);
		
	}
	private void kjks(String StreetName, String VillageName) {
		System.out.println("String Address: "+StreetName+ "\n Village Name: "+VillageName);
		
	}
	private void kjks(long l, String TalukName, String DistName ) {

	}
	private void kjks(int Pincode) {

		
	}
	private void kjks(String StateName) {

	}
	
	public static void main(String[] args) {
		
		OverloadingMethod o = new OverloadingMethod();
		
		o.kjks("Karthikeyan", 37);
		o.kjks("Vanniyar Street", "Indalur");
		o.kjks(8610308394l, "cheyyur", "Chengalpattu");
		o.kjks(603301);
		o.kjks("Tamil Nadu");
		
	}
	
	

}
