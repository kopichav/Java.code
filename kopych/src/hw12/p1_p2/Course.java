package hw12.p1_p2;

import java.util.regex.Pattern;

public class Course {
    public static void main(String[] args) {
        String name = "Name ";
        System.out.println(name);
 //method pattern
        Pattern pattern = Pattern.compile("Name");
        System.out.println(pattern.pattern());
 //method matches
        System.out.println(Pattern.matches("Name", name));
    }
}
