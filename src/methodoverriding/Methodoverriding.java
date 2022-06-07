package methodoverriding;

 class Bank
 {
	 int getRateOfInterest()
	 {
		 return 0;
	 }
 }

 class SBI extends Bank
 {
	 int getRateOfInterest()
	 {
		 return 10;
	 }
 }
 
 class ICICI extends Bank
 {
	 int getRateOfInterest()
	 {
		 return 15;
	 }
 }
 
 class AXIS extends Bank
 {
	 int getRateOfInterest()
	 {
		 return 12;
	 }
 }

public class Methodoverriding {

	public static void main(String[] args) {
		
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateOfInterest());

		ICICI iciciobj=new ICICI();
		System.out.println(iciciobj.getRateOfInterest());
		
		AXIS axixobj=new AXIS();
		System.out.println(axixobj.getRateOfInterest());
	}

}
