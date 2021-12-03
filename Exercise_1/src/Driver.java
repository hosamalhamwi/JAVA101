public class Driver {

    private String fullName;
    private int yearBorn;
    private int age=0;
    private String licenceType;
    private int CurrentYear=2021;

    public Driver(String fName , int yBorn , String Ltype){
        this.fullName = fName;
        this.yearBorn = yBorn;
        this.licenceType = Ltype;
    }

    public Driver(String fName , String Ltype){
        this.fullName = fName;
        this.licenceType = Ltype;

    }

    public String getFullName() {
        return fullName;
    }

    public String getLicenceType() {
        return licenceType;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public int getAge() {

        return CurrentYear - yearBorn ;
    }
}
