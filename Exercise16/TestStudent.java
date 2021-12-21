public class TestStudent {
    public static void main(String[] args) {
        Person anon = new Person();
        anon.register(); //age is zero and name is null because we didnt initialize it yet
        anon.setName("Mike");
        anon.setAge(23);
        anon.register();
        Person helen = new Person("Helen",19);
        helen.register();
    }
}
