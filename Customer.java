public class Customer {

    private double arrivalTime;
    private double serviceTime; 

    private Customer(double arrTime, double svcTime) {
        this.arrivalTime = arrTime;
        this.serviceTime = svcTime;
    }

    public takeService(){
        serviceTime -= serviceTime;
    }

    private  isComplete() {
        if (serviceTime == 0){
            return true;
        }
        else{
            return false;
        }
    }


    public static Customer generateCustomer(double arrTime, double svcTime){
        return new Customer(arrTime, svcTime);
    }
}