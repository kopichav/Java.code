package hw11.p1;

public enum Role {
    STUDENT(20),
    TEACHER(40);

    private int years;

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    Role() {
    }

    Role(int years) {
        this.years = years;
    }

}
