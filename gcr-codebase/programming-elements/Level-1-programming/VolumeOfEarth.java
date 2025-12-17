
// Program to compute the volume of Earth in km^3 and miles^3
public class VolumeOfEarth{
	public static void main(String args[]){

	double pi = 3.14;
	int radiusInKilometer = 6;
        double radiusInMiles = radiusInKilometer * 0.6;

	// Finding the volume in kilometers
	double volumeInKilometer =  pi *(radiusInKilometer * radiusInKilometer * radiusInKilometer)*4/3;
	
	// Finding the volume in miles
       double  volumeInmile =  pi * (radiusInMiles * radiusInMiles * radiusInMiles)*4/3;

System.out.println("The volume of earth in cubic kilometers is : "+volumeInKilometer+ " and cubic miles is : " +volumeInmile);
}
} 