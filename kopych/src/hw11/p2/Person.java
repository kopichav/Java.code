package hw11.p2;

import hw11.p1.Role;

import java.util.regex.Pattern;

public class Person {
 // hw12 p1_p2
    public static void main(String[] args) {
         String firstname = "Firstname ";
         String lastname = "Lastname ";
         String phone = "Phone ";
         String email = "Email ";
        System.out.println(firstname + lastname + phone + email);
        //method pattern
        Pattern pattern = Pattern.compile("Phone");
        System.out.println(pattern.pattern());
        //method matches
        System.out.println(Pattern.matches("Phone", phone));
    }

    public String name;
    private int id;

    private static int counter = 0;

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
