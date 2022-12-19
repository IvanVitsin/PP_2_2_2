package web.model;

public class CarModel {
    private String model;
    private int year;
    private int price;

    public CarModel(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public CarModel() {

    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
