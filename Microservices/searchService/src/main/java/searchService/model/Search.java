package searchService.model;


import java.util.Date;

//@Entity
public class Search {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "brand", nullable = false)
    private String brand;

    //@Column(name = "model", nullable = false)
    private String model;

    //@Column(name = "fuel_type", nullable = false)
    private String fuel_type;

    //@Column(name = "transmission_type", nullable = false)
    private String transmission_type;

    //@Column(name = "vehicle_class", nullable = false)
    private String vehicle_class;

    //@Column(name = "price", nullable = false)
    private float price;

    //@Column(name = "mileage", nullable = false)
    private float mileage;

    //@Column(name = "mileage_limit", nullable = false)
    private float mileage_limit;

    //@Column(name = "cdw", nullable = false)
    private boolean cdw;

    //@Column(name = "child_seats", nullable = false)
    private int child_seats;

    //@Column(name = "location", nullable = false)
    private String location;

    //@Column(name = "dateTo", nullable = false)
    private Date dateTo;

    //@Column(name = "dateFrom", nullable = false)
    private Date dateFrom;

    public Search(){
        super();
    }

    public Search(Long id, String brand, String model, String fuel_type, String transmission_type, String vehicle_class, float price, float mileage, float mileage_limit, boolean cdw, int child_seats, String location, Date dateTo, Date dateFrom) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.fuel_type = fuel_type;
        this.transmission_type = transmission_type;
        this.vehicle_class = vehicle_class;
        this.price = price;
        this.mileage = mileage;
        this.mileage_limit = mileage_limit;
        this.cdw = cdw;
        this.child_seats = child_seats;
        this.location = location;
        this.dateTo = dateTo;
        this.dateFrom = dateFrom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getTransmission_type() {
        return transmission_type;
    }

    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    public String getVehicle_class() {
        return vehicle_class;
    }

    public void setVehicle_class(String vehicle_class) {
        this.vehicle_class = vehicle_class;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public float getMileage_limit() {
        return mileage_limit;
    }

    public void setMileage_limit(float mileage_limit) {
        this.mileage_limit = mileage_limit;
    }

    public boolean isCdw() {
        return cdw;
    }

    public void setCdw(boolean cdw) {
        this.cdw = cdw;
    }

    public int getChild_seats() {
        return child_seats;
    }

    public void setChild_seats(int child_seats) {
        this.child_seats = child_seats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }
}
