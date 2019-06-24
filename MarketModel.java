import java.util.Random;
public class MarketModel{
   public void runSimulation(double probOfNewArrival,double runningTime, double averageTime){
      Cashier cashier = new Cashier();
      for (int currentTime = 0; currentTime < runningTime; currentTime++){
         Random rand = new Random();
         double rand_dub1 = rand.nextDouble(); 
         if (rand_dub1 >= probOfNewArrival){
            Customer c = Customer.generateCustomer(currentTime, averageTime);
            cashier.addCustomer(c);
         }
      } // end SimulationLoop  
   }// end runSimulation        
} // end MarketModel

