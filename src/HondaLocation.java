import java.util.ArrayList;
import java.util.List;

public class HondaLocation {

    private String address;
    private int numberOfEmployees;
    private double annualAverageRevenue;
    private List<String> cars;

    public HondaLocation(double annualAverageRevenue, ArrayList<String> cars, int numberOfEmployees, String address) {
        this.annualAverageRevenue = annualAverageRevenue;
        this.cars = (cars != null) ? cars : new ArrayList<>();  // prevent null pointer
        this.numberOfEmployees = numberOfEmployees;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAnnualAverageRevenue() {
        return annualAverageRevenue;
    }

    public void setAnnualAverageRevenue(double annualAverageRevenue) {
        this.annualAverageRevenue = annualAverageRevenue;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = (cars != null) ? cars : new ArrayList<>();
    }

    public void addCar(String carModel) {
        if (this.cars == null) {
            this.cars = new ArrayList<>();
        }
        this.cars.add(carModel);
    }
}