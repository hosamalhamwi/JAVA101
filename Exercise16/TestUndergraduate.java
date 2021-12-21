public class TestUndergraduate {
    public static void main(String[] args) {
        Undergraduate mike = new Undergraduate();
        mike.setName("Mike");
        mike.setAge(23);
        mike.setYear(2020);
        mike.setProg("Software Engineering");
        mike.register();
        mike.changeYear();
        mike.register();
        mike.study(25);

        Undergraduate helen = new Undergraduate("Helen",22,45,"Economics",2021);
        helen.register();
        helen.changeYear();
        helen.register();
        helen.study(40);

    }
}
