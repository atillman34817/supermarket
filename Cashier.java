public class Cashier {
	
	private LinkedQueue<Customer> customers;
	private int servicedCustomer;
	
	public Cashier() {
		customers = new LinkedQueue<Customer>();
	}
	
	public void addCustomer(Customer customer) {
		customers.enqueue(customer);
	} //end addCustomer
	
	public void removeCustomer() {
		customers.dequeue();
	} //end removeCustomer
	
	public void serviceCustomer() {
		Customer aCustomer = customers.peek();
		
		aCustomer.takeService();
		
		if(aCustomer.isComplete()){
			customers.dequeue();
			this.servicedCustomer++;
		}
	}// end serviceCustomer

	public int getServicedCustomer(){

	return this.servicedCustomer;

	}
	
	
	public int queueLength() {
		
		return customers.size();
		
	}//end queueLength

}