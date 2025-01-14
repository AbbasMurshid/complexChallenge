public class Car {

    private String brand;
    private String model;
    private int year;

    private int rentalPricePerDay;
    private boolean isRented;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        rentalPricePerDay = 50;
        isRented = false;
    }
    public int getRentalPricePerDay() {
        return rentalPricePerDay;
    }
    public void rentCar() {

        if (isRented) {
            System.out.println("Car is Already Rented Try another car");
        }else {
            isRented = true;
            System.out.println("Renting Car => " + brand + " " + model + " " + year);
        }
    }
    public void returnCar() {
        isRented = false;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
