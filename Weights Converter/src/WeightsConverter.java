
public class WeightsConverter {

	
	
	static void meterstoinches(double meter){
		double inch =  meter * 39.37;
		System.out.println(inch);
	}
	
	static void inchestometers(double inches){
		double meter = inches / 39.97;
		System.out.println(meter);
	}
	
	static void yardstometers(double yards){
		double meters = yards * 91.44;
		System.out.println(meters);
	}
	
	static void meterstoyards(double meter){
		double yards = meter / 91.44;
		System.out.println(yards);
	}
	
	static void foottometers(double foot){
		double meters = foot * 30.48 ;
		System.out.println(meters);
	}
	
	static void meterstofoot(double meter){
		double foot = meter / 30.48;
		System.out.println(foot);
	}
	
	static void kilotopound(double kilo){
		double pound = kilo * 2.20;
		System.out.println(pound);
	}
	
	static void poundtokilo(double pound){
		double kilo = pound / 2.20;
		System.out.println(kilo);
	}

	public static void main(String[] args) {

		//testing
		//testing again
		meterstoinches(1.80);
		inchestometers(70.866);
		yardstometers(45);
		meterstoyards(4114.8);
	    foottometers(6);
	    meterstofoot(182.88);
	    kilotopound(90);
       poundtokilo(198);
	}

}
