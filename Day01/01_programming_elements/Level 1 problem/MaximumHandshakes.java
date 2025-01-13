import java.util.*;
public class MaximumHandshakes{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		//Enter the number of Students
		int numberOfStudents = input.nextInt();
		// Calculates the maximum number of handshakes
		int maxHandshakes = (numberOfStudents * ( numberOfStudents - 1 )) / 2 ;
		System.out.println("the number of possible handshakes: " + maxHandshakes);
	}
}