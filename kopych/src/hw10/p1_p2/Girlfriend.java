package hw10.p1_p2;

public class Girlfriend extends Friend {
    private String ring;

    public Girlfriend (String name, String city, int age, String ring) {
        super(name, city, age);
        this.ring = ring;
    }

    public Girlfriend(String name, String city, int age) {
        super(name, city, age);
    }

    public String getRing() {
        return ring;
    }

    public void setBox(String ring) {
        this.ring = ring;
    }

    @Override
    protected void greater() {
        super.greater();
        System.out.println("my girlfriend from this " + ring);
    }
}
