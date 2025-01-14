public class Transaction {

    private int transactionId;

    private Car car;

    private Customer customer;

    private int rentaldays;


    public Transaction(int transactionId, Car car, Customer customer, int rentaldays) {
        this.transactionId = transactionId;
        this.car = car;
        this.customer = customer;
        this.rentaldays = rentaldays;
    }

    public int totalAmount() {
        return car.getRentalPricePerDay()*rentaldays;


    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", car=" + car +
                ", customer=" + customer +
                ", rentaldays=" + rentaldays +
                '}';
    }
}
