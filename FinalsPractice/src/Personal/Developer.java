public abstract class Developer implements Report{
    protected String name;
    protected String surname;
    protected String email;
    protected int age;
    protected boolean isPartTime = false;
    protected Manager manager;

    Developer(int age){
        this.age = age;
    }

    Developer(String email,boolean isPartTime){
        this.email = email;
        this.isPartTime = isPartTime;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getEmail(){
        return this.email;
    }

    public boolean getIsPartTime(){
        return this.isPartTime;
    }

    public abstract void birthday(String name);

    public void setManager(Manager manager){
        this.manager = manager;
    }
    public String managerName(){
        return this.manager.getName();
    }




}
