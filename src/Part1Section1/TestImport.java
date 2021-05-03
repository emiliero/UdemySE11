package Part1Section1;

// type-import-demand-declaration
import Part1Section1.garden.vegetable.*;
import Part1Section1.nursery.vegetable.*;

public class TestImport {
    public static void main(String[] args) {
        // String class in the java.lang package, simple check class name ok
        // no import statement required
        String s = "We are testing import statements";
        System.out.println(s);

        // We use simple name because we specified location in the import statement
        VineVegetable.main(args);
        Part1Section1.nursery.vegetable.VineVegetable.main(args);
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}