public class MarketModel(probOfNewArrival, runningTime, averageTime)
{
   this.probOfNewArrival = probOfNewArrival;
   this.runningTime = runningTime;
   this.averageTime = averageTime;
   
   Cashier();
     
} // end MarketModel

public class runSimulation()
{
   for (int currentTime = 0; i < runningTime; i++)
   {
      customer = generateCustomer(this.probOfNewArrival, currentTime, this.averageTime)
      if customer != None
         Cashier.addCustomer(customer)
      Cashier.serviceCustomers(currentTime)
   } // end SimulationLoop
}// end runSimulation