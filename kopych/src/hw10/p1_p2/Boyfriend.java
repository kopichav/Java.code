package hw10.p1_p2;

public class Boyfriend extends Friend {
    private String car;

    public Boyfriend (String name, String city, int age, String car) {
        super(name, city, age);
        this.car = car;
    }

    public Boyfriend(String name, String city, int age) {
        super(name, city, age);
    }

    public String getRing() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
    @Override
    protected void greater() {
        super.greater();
        System.out.println("my boyfriend from this " + car);
    }
}
