package hw10.p1_p2;

public class Friend {
    private String name;

    private int age;

    private String city;

    private String country;

    static int id;

    public Friend(String name, String city, int age) {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        if (name.equals("Stop")) {
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Friend(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    public Friend(String name) {
        this.name = name;
    }

    public Friend(int age) {
        this.age = age;
    }
    protected void greater() {
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

