package Part1Section1;

public class TestFQCN {
    public static void main(String[] args) {
        // String class in the java.lang package, simple class name ok.
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        // Any class in any other packages must be qualified or imported.
        Part1Section1.garden.vegetable.VineVegetable.main(args);
    }
}
