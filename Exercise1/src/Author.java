public class Author {
    private String name;
    private int yearBorn;
    private int passedYear;

    public Author(int yearBorn , String name , int passedYear){
        this.yearBorn = yearBorn;
        this.name = name;
        this.passedYear = passedYear;
    }

    public String getName() {
        return name;
    }

    public void setPassedYear(int passedYear) {
        this.passedYear = passedYear;
    }

    public int Age(){
        return passedYear - yearBorn;
    }


}
