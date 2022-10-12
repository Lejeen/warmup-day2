public class WrmUp {

    static float myVar = 2.0f; // This to the PermGen

    public static void main(String[] args) {

        int i = 42; // Local variable
        String myString = "Hello"; // Immutable!!
        String myString2 = myString;
        myString = myString + " World! ";
        System.out.println(myString);
        System.out.println(myString2);

        String sentence = "You look \"weird\"\ttoday!\n";

        int k = 15;
        long j = 15000;

        k = (int) j;

        //Convert grams to kilograms
        double convertedValue = convertGramToKilograms(j);
        System.out.println(convertedValue);

        StringBuilder myBuilder = new StringBuilder(); //Mutable
        myBuilder.append("Hello");
        StringBuilder anotherBuilder = myBuilder;
        myBuilder.append(" World! ");

        System.out.println(myBuilder);

        

    }


    public static double convertGramToKilograms(double valueInGrams) {
        double convertedValue = valueInGrams / 1000;
        return convertedValue;
    }

}
