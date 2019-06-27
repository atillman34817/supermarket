public class Customer {

    private double arrivalTime;
    private double serviceTime; 


    private Customer(double arrTime, double svcTime) {
        this.arrivalTime = arrTime;
        this.serviceTime = svcTime;
    }

    public void takeService(){
        this.serviceTime = this.serviceTime - 1;
    }

    public boolean isComplete() {
        return serviceTime == 0;
    }

    public static Customer generateCustomer(double arrTime, double svcTime){
        return new Customer(arrTime, svcTime);
    }
}