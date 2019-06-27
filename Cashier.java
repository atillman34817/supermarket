
public class Cashier {
	
	private LinkedQueue<Customer> customers;
	
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
		
		while(!aCustomer.isComplete) {
			aCustomer.takeService();
		}
		
		customers.dequeue();
		
	}// end serviceCustomer
	
	
	public int queueLength() {
		
		return customers.size();
		
	}//end queueLength

}