package web.models;

public class Car {
    private String model;
    private int series;
    private String company;

    public Car(String model, int series, String company) {
        this.model = model;
        this.series = series;
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car " +
                "model = " + model +
                ", series = " + series +
                ", company = " + company;
    }
}
