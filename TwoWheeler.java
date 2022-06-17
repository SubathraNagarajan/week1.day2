package assignment.day2;

public class TwoWheeler {
int noOfWheels = 2;
short noOfMirrors = 1;
long chasisNumber = 12346887;
boolean isPunctured = false;
String bikeName = "Thunderbird";
double runningKM = 589012.78687;
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		//obj.noOfMirrors;
		System.out.println("Number of Mirrors = "+ obj.noOfMirrors);
		int noOfWheels = obj.noOfWheels;
		System.out.println("Number of Wheels = "+ noOfWheels);
		long chasisNumber = obj.chasisNumber;
		System.out.println("Chais Number = "+ chasisNumber);
		boolean isPunctured = obj.isPunctured;
		System.out.println("Is the Wheel Punctured? "+ isPunctured);
		String bikeName = obj.bikeName;
		System.out.println("Bike name is "+ bikeName);
		double runningKM = obj.runningKM;
		System.out.println("KM run = "+ runningKM);
		}

}
