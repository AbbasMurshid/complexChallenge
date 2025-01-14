public class Customer {

    private String name;
    private int customerId;
    private Car rentalCar;

    public Customer(String name, int customerId, Car rentalCar) {
        this.name = name;
        this.customerId = customerId;
        this.rentalCar = rentalCar;
    }
    public void setRentalCar(Car rentalCar) {
        this.rentalCar = rentalCar;
    }

    public void rentCar() {
        rentalCar.rentCar();
    }

    public void returnCar() {
        rentalCar.returnCar();


    }

//    public void displayCustomer() {
//        System.out.println("*".repeat(20));
//        System.out.println(name);
//        System.out.println(customerId);
//        System.out.println(rentalCar);
//        System.out.println("*".repeat(20));
//    }


    @Override
    public String toString() {
        return "*".repeat(20) + "\n" +
                "name='" + name + '\'' +
                ", customerId=" + customerId +
                ", rentalCar=" + rentalCar +
                "} \n"+ "*".repeat(20)  ;
    }
}
