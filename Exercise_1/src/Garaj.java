public class Garaj {
    public static void main(String[] args) {
        Driver driver = new Driver("John Black" , "D");
        driver.setYearBorn(1990);

        Car car = new Car("Honda Civic" , 1600);
        car.setDriver(driver);

        Object myArray[] = {driver , car};
        String output = "";

        for (Object eachObject : myArray){
            if(eachObject instanceof Driver){
                Driver d = (Driver) eachObject;
                output+= "\n Driver Name : " + d.getFullName();
                output+= "\n Driver Age : " + d.getAge();
                output+= "\n Driver Licence Type : " + d.getLicenceType();

            }
            if(eachObject instanceof Car){
                Car c = (Car) eachObject;
                output+= "\n Car Model : " + c.getModel();
                output+= "\n Car HorsePower : " + c.getHorsePower();

            }
        }

        System.out.println(output);




    }
}
