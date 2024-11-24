public class Car {
    public Car(String model, int price, int year, double volume) {
        this.model = model;
        this.price = price;
        this.year = year;
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public double getVolume() {
        return volume;
    }

    private String model;
    private int price;

    private int year;
    private double volume;


    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", volume=" + volume +
                '}';
    }
}
