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
	
<<<<<<< HEAD
	public void serviceCustomer(){
    if(customers.isEmpty()){
       return;
      }
		Customer aCustomer = customers.peek();
		
=======
	public void serviceCustomer() {
      if (this.customers.isEmpty()) return;
		Customer aCustomer = customers.peek();
>>>>>>> f91d7c24259617a04a359ece6de042e44da76f98
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