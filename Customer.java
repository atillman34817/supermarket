public class Customer {
    private double arrivalTime;
    private double serviceTime;

    private Customer(double arrTime, double svcTime) {
        this.arrivalTime = arrTime;
        this.serviceTime = svcTime;
    }

    public static Customer generateCustomer(double arrTime, double svcTime){
        return new Customer(arrTime, svcTime);
    }
}