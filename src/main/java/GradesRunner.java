import java.util.Arrays;

public class GradesRunner {
    public static void main(String[] args) {
        Grades g = new Grades();
        g.add(5);
        g.add(3);
        g.add(6);
        g.add(2);
        g.add(3);
        g.add(2);
        g.add(5);
        g.add(2);
        g.add(1);
        g.add(2);
        int[] grades = g.getGrades();
        System.out.println(Arrays.toString(grades));
        System.out.println(g.last());
        System.out.println(g.average());


    }
}