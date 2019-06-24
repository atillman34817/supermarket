package TimeSimulation;

public class Cashier {
	
	LinkedQueue<Customer> customers = new LinkedQueue<>();
	
	public void addCustomer(Customer customer) {
		customers.enqueue(customer);
	} //end addCustomer
	
	public void removeCustomer() {
		customers.dequeue();
	} //end removeCustomer
	
	public void serviceCostumer() {
		
		Customer aCustomer = customers.peek();
		aCustomer.substractServiceUnit();
		
	}//end servceCustomer
	
	public int queueLength() {
		
		return customers.size();
		
	}//end queueLength

}