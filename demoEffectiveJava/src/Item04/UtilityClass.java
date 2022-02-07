package Item04;

// Noninstantiable utility class
public abstract class UtilityClass {
    // Suppress default constructor for noninstantiability
//    private UtilityClass(){
//        throw new AssertionError();
//    }

    public static String getName(){
        return "Beobsik";
    }
}
