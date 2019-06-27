import java.util.Random;

public class MarketModel{
   public void runSimulation(double probOfNewArrival,double runningTime, double averageTime){
      Cashier cashier = new Cashier();
      int counter = 0;
      for (int currentTime = 0; currentTime < runningTime; currentTime++){
         Random rand = new Random();
         double rand_dub1 = rand.nextDouble(); 
         if (rand_dub1 >= probOfNewArrival){
            Customer c = Customer.generateCustomer(currentTime, averageTime);
            cashier.addCustomer(c);            
         }
<<<<<<< HEAD
      cashier.serviceCustomer();
=======
         cashier.serviceCustomer();
>>>>>>> f91d7c24259617a04a359ece6de042e44da76f98
      } // end SimulationLoop  
   System.out.println("Number of customers served : " + cashier.getServicedCustomer());   
   System.out.println("Number of customers left in queue : " + cashier.queueLength());
   System.out.println("Average time customers spend \n waiting to be served : " + 
   runningTime / cashier.getServicedCustomer()); 
   }// end runSimulation

   }// end MarketModel

