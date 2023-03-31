package hw11.p3_p4;

import hw11.p1.Role;

import java.util.regex.Pattern;

public class Lecture {
 // hw12 p1_p2
    public static void main(String[] args) {
     String name = "Name ";
     String description = "Description ";
     System.out.println(name + description );
 //method pattern
      Pattern pattern = Pattern.compile("Description");
      System.out.println(pattern.pattern());
 //method matches
      System.out.println(Pattern.matches("Description", description));
}
    public static Lecture lecture;
    private int id;

    private static int counter = 0;

     private int person;

    public Lecture() {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 //hw11   p4:
      Role teacher = Role.TEACHER;

}
