public class Car{

    private String model;
    private boolean isElectric = false;
    private Driver driver;
    private int horsePower;

    public Car(String model , int horsePower ){
        this.model = model;
        this.horsePower = horsePower;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getOwnerName(){
        return driver.getFullName();
    }

    public void setDriver(Driver d){
        this.driver = d;
    }


}
