public class VolumeOfEarth  {
    public static void main(String[] args) {
         
		// Radius of Earth in kilometers
        int radiusOfEarth = 6378;

        // Volume of a Sphere is (4/3) * pi * r^3
        double volumeOfEarthInKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusOfEarth, 3);

        // Conversion factor from cubic kilometers to cubic miles
        double kmToMilesConversionFactor = 0.386102;
        double volumeOfEarthInMiles = volumeOfEarthInKm * kmToMilesConversionFactor;

        // Displaying results 
        System.out.println( " The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInMiles  );
   
   }
}