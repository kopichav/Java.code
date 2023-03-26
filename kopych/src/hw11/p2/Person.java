package hw11.p2;

import hw11.p1.Role;

public class Person {
    private int id;

    private static int counter = 0;

    private String name;

    private Role role;

    private int course;

    public Person(int course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
