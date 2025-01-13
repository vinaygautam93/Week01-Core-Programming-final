public class DividePens {
    public static void main(String[] args) {
        
		//total pens
        int totalPens = 14;
		
		//total Student
        int totalstudents = 3; 
        
		//Calculating how many pens each student will get 
		int penGetEach = totalPens / totalstudents;
		
		//Calculating remaining pen
		int remainingPen = totalPens % totalstudents;
		
        // Displaying answer 
        System.out.println(" The Pen Per Student is " + penGetEach + " and the remaining pen not distributed is " + remainingPen );
    }
}