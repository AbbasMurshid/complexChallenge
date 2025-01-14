public  class Main  {

    public static void main(String[] args) {

        Car car1 = new Car("TOYOTO","SUPRA",1987);
        Car car2 = new Car("Benz","Mercedes",1900);
        Customer customer1 = new Customer("Abbas Murshid" , 127,
                car1);
        customer1.rentCar();
//        customer1.displayCustomer();

        Customer customer2 = new Customer("Aiysha Afrin", 156,car1);

        customer2.setRentalCar(car2);
        customer2.rentCar();
//        customer2.displayCustomer();
//
//        System.out.println(car1);
//        System.out.println(car2);
        Transaction transaction = new Transaction(145,car2,customer2,5);
        System.out.println(transaction);
        System.out.println(transaction.totalAmount()+"\u20B9");
    }


}