import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the probability of a new arrival : ");
   double probOfNewArrival = input.nextDouble();
   System.out.println("Enter the running time : ");
   double runningTime = input.nextDouble();
   System.out.println("Enter the average time per customer : ");
   double averageTime = input.nextDouble();
   
   MarketModel model = new MarketModel();
   model.runSimulation(probOfNewArrival,runningTime,averageTime);
   
		//probOfNewArrival, runningTime, averageTime
	}

}