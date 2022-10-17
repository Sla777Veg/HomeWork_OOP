public class Car {
    String brand;
    String model;
    double engineVolume;
    String bodyColor;
    int ProductionYear;
    String assemblyCountry;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", bodyColor='" + bodyColor + '\'' +
                ", ProductionYear=" + ProductionYear +
                ", assemblyCountry='" + assemblyCountry + '\'' +
                '}';
    }

    public Car(String brand, String model, double engineVolume, String bodyColor, int ProductionYear, String assemblyCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.bodyColor = bodyColor;
        this.ProductionYear = ProductionYear;
        this.assemblyCountry = assemblyCountry;

        if (brand==null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model==null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (assemblyCountry==null) {
            this.assemblyCountry = "default";
        } else {
            this.assemblyCountry = assemblyCountry;
        }

        if (engineVolume ==0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (bodyColor==null) {
            this.bodyColor = "белый ";
        } else {
            this.bodyColor = bodyColor;
        }

        if (ProductionYear ==0) {
            this.ProductionYear = 2000;
        } else {
            this.ProductionYear = ProductionYear;
        }
    }
}
